package com.cafezin.agenda.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cafezin.agenda.factory.ConnectionFactory;
import com.cafezin.agenda.model.Cliente;
import com.mysql.jdbc.PreparedStatement;

public class ClienteDAO {

	/*
	 * CRUD
	 * C = CREATE
	 * R = READ
	 * U = UPDATE
	 * D = DELETE
	 */
	
	public void create(Cliente cliente) {
		
		String sql = "INSERT INTO cliente(nome, sexo, telefone) VALUES(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			// Criar uma conexão com o Banco de Dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			// Foi criado uma PreparedStatement, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			// Adicionar os valores
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getSexo());
			pstm.setString(3, cliente.getTelefone());
			
			// Executar a query
			pstm.execute();
			
			System.out.println("Cliente cadastrado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fechar as conexões
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(Cliente cliente) {
		String sql = "UPDATE `agenda`.`cliente` SET `nome` = ?, `sexo` = ?, `telefone` = ? WHERE (`idCliente` = ?);";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			// Criar conexão com o Banco
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			// Adicionar os valores para atualizar
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getSexo());
			pstm.setString(3, cliente.getTelefone());
			
			// Qual o ID do registro que deseja atualizar?
			pstm.setInt(4, cliente.getIdCliente());
			
			//Executar a query
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteByID(int id) {
		String sql = "DELETE FROM cliente WHERE (`idCliente` = ?);";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			// Criar conexão com o Banco
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			// Qual o ID do registro que deseja deletar?
			pstm.setInt(1, id);
			
			//Executar a query
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public Cliente selectCliente(int id){
		String sql = "SELECT * FROM cliente WHERE idCliente = ?;";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			Cliente clientes = new Cliente();

			rset.first();

			clientes.setIdCliente(id);
			clientes.setNome(rset.getString("nome"));
			clientes.setSexo(rset.getString("sexo"));
			clientes.setTelefone(rset.getString("telefone"));

			return clientes;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(pstm != null) {
					pstm.close();
				}

				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static List<Cliente> listarClientes(){
		String sql = "SELECT * FROM cliente";

		List<Cliente> clientes = new ArrayList<Cliente>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Recuperar os dados do Banco. ***SELECT***
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while(rset.next()) {
				Cliente cliente = new Cliente();

				// Mostrar o ID
				cliente.setIdCliente(rset.getInt("idCliente"));
				cliente.setNome(rset.getString("nome"));
				cliente.setSexo(rset.getString("sexo"));
				cliente.setTelefone(rset.getString("telefone"));

				clientes.add(cliente);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rset != null) {
					rset.close();
				}

				if(pstm != null) {
					pstm.close();
				}

				if(conn != null) {
					pstm.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return clientes;
	}
}