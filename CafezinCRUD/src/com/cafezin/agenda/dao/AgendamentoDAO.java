package com.cafezin.agenda.dao;

import com.cafezin.agenda.factory.ConnectionFactory;
import com.cafezin.agenda.model.Agendamento;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoDAO {

	/*
	 * CRUD
	 * C = CREATE
	 * R = READ
	 * U = UPDATE
	 * D = DELETE
	 */


	// Metódo para criar Agendamento
	public void create(Agendamento agendar) {

		// Preparando a conexão
		String sql = "INSERT INTO agendamento(hora, dataAgenda, valor, servico, formaPagamento, statusPG, idCabelereiro, idCliente) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criar uma conexão com o Banco de Dados
			conn = ConnectionFactory.createConnectionToMySQL();

			// Foi criado uma PreparedStatement, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			// Adicionar os valores
			pstm.setString(1, agendar.getHora());
			pstm.setString(2, agendar.getDataAgenda());
			pstm.setInt(3, agendar.getValor());
			pstm.setString(4, agendar.getServico());
			pstm.setString(5, agendar.getFormaPagamento());
			pstm.setString(6, agendar.getStatusPG());
			pstm.setInt(7, agendar.getCabeleireiro().getIdCabeleireiro());
			pstm.setInt(8, agendar.getCliente().getIdCliente());

			// Executar a query
			pstm.execute();

			System.out.println("Agendamento realizado com sucesso!");
		} catch (Exception e) {
			System.out.println("Não foi possível realizar o agendamento!");
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

	// Metódo para fazer o Update
	public void update(Agendamento agendamento) {

		// Preparando a conexão

		String sql = "UPDATE `agenda`.`agendamento` SET `hora` = ?, `dataAgenda` = ?, `valor` = ?, `formaPagamento` = ?, `statusPG` = ?, `idCabelereiro` = ?, `idCliente` = ? WHERE (`idAgenda` = ?);";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {

			// Criar conexão com o Banco
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			// Adicionar os valores para atualizar
			pstm.setString(1, agendamento.getHora());
			pstm.setString(2, agendamento.getDataAgenda());
			pstm.setInt(3, agendamento.getValor());
			pstm.setString(4, agendamento.getFormaPagamento());
			pstm.setString(5, agendamento.getStatusPG());
			pstm.setInt(6, agendamento.getCabeleireiro().getIdCabeleireiro());
			pstm.setInt(7, agendamento.getCliente().getIdCliente());

			// Qual o ID do registro que deseja atualizar?
			pstm.setInt(8, agendamento.getIdAgenda());
			
			//Executar a query
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fechando a conexão
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

	public Agendamento selectAgendamento(int id){
		String sql = "SELECT * FROM agendamento WHERE idAgenda = ?;";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			Agendamento agendamento = new Agendamento();

			rset.first();

			agendamento.setIdAgenda(rset.getInt("idAgenda"));
			agendamento.setHora(rset.getString("hora"));
			agendamento.setDataAgenda(rset.getString("dataAgenda"));
			agendamento.setValor(rset.getInt("valor"));
			agendamento.setServico(rset.getString("servico"));
			agendamento.setFormaPagamento(rset.getString("formaPagamento"));
			agendamento.setIdCabelereiro(rset.getInt("idCabelereiro"));
			agendamento.setIdCliente(rset.getInt("idCliente"));

			return agendamento;

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


	public void deleteByID(int id) {
		String sql = "DELETE FROM agendamento WHERE (`idAgenda` = ?);";
		
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
	public static List<Agendamento> listarAgendamentos(){
		String sql = "SELECT * FROM agendamento";

		List<Agendamento> agendamentos = new ArrayList<Agendamento>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Recuperar os dados do Banco. ***SELECT***
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while(rset.next()) {
				Agendamento agendamento = new Agendamento();

				// Mostrar o ID
				agendamento.setIdAgenda(rset.getInt("idAgenda"));
				agendamento.setHora(rset.getString("hora"));
				agendamento.setDataAgenda(rset.getString("dataAgenda"));
				agendamento.setValor(rset.getInt("valor"));
				agendamento.setServico(rset.getString("servico"));
				agendamento.setFormaPagamento(rset.getString("formaPagamento"));
				agendamento.setIdCabelereiro(rset.getInt("idCabelereiro"));
				agendamento.setIdCliente(rset.getInt("idCliente"));
				agendamento.setStatusPG(rset.getString("statusPG"));

				agendamentos.add(agendamento);
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

		return agendamentos;
	}
}