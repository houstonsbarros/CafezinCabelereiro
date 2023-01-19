package com.cafezin.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cafezin.agenda.factory.ConnectionFactory;
import com.cafezin.agenda.model.Cabeleireiro;
import com.mysql.jdbc.PreparedStatement;

public class CabelereiroDAO {

	/*
	 * CRUD
	 * C = CREATE
	 * R = READ
	 * U = UPDATE
	 * D = DELETE
	 */
	
	public void create(Cabeleireiro cabeleireiro) {
		
		String sql = "INSERT INTO cabeleireiro(nome, dataNasc, anosProfissao, especialidade, horariosDeTrabalho) VALUES(?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			// Criar uma conexão com o Banco de Dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			// Foi criado uma PreparedStatement, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			// Adicionar os valores
			pstm.setString(1, cabeleireiro.getNome());
			pstm.setDate(2, new Date(cabeleireiro.getDataNasc().getTime()));
			pstm.setInt(3, cabeleireiro.getAnosProfissao());
			pstm.setString(4, cabeleireiro.getEspecialidade());
			pstm.setString(5, cabeleireiro.getHorariosDeTrabalho());
			
			// Executar a query
			pstm.execute();
			
			System.out.println("Cabeleireiro cadastrado com sucesso!");
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
	
	public void update(Cabeleireiro cabeleireiro) {
		String sql = "UPDATE `agenda`.`cabeleireiro` SET `nome` = ?, `dataNasc` = ?, `anosProfissao` = ?, `especialidade` = ?, `horariosDeTrabalho` = ? WHERE (`idCabelereiro` = ?);";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			// Criar conexão com o Banco
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			// Adicionar os valores para atualizar
			pstm.setString(1, cabeleireiro.getNome());
			pstm.setDate(2, new Date(cabeleireiro.getDataNasc().getTime()));
			pstm.setInt(3, cabeleireiro.getAnosProfissao());
			pstm.setString(4, cabeleireiro.getEspecialidade());
			pstm.setString(5, cabeleireiro.getHorariosDeTrabalho());
			
			// Qual o ID do registro que deseja atualizar?
			pstm.setInt(6, cabeleireiro.getIdCabeleireiro());
			
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
		String sql = "DELETE FROM cabeleireiro WHERE (`idCabelereiro` = ?);";
		
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

	public Cabeleireiro selectCabeleireiro(int id){
		String sql = "SELECT * FROM cabeleireiro WHERE idCabelereiro = ?;";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			Cabeleireiro cabeleireiro = new Cabeleireiro();

			rset.first();

			cabeleireiro.setIdCabeleireiro(id);
			cabeleireiro.setNome(rset.getString("nome"));
			cabeleireiro.setDataNasc(rset.getDate("dataNasc"));
			cabeleireiro.setAnosProfissao(rset.getInt("anosProfissao"));
			cabeleireiro.setEspecialidade(rset.getString("especialidade"));
			cabeleireiro.setHorariosDeTrabalho(rset.getString("horariosDeTrabalho"));

			return cabeleireiro;

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

	public static List<Cabeleireiro> listarCabeleireiros(){
		String sql = "SELECT * FROM cabeleireiro";

		List<Cabeleireiro> cabeleireiros = new ArrayList<Cabeleireiro>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Recuperar os dados do Banco. ***SELECT***
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while(rset.next()) {
				Cabeleireiro cabelereiro = new Cabeleireiro();

				// Mostrar o ID
				cabelereiro.setIdCabeleireiro(rset.getInt("idCabelereiro"));

				// Mostrar o Nome
				cabelereiro.setNome(rset.getString("nome"));

				// Mostrar os anos de profissão
				cabelereiro.setAnosProfissao(Integer.parseInt(rset.getString("anosProfissao")));

				// Mostrar as especialidades
				cabelereiro.setEspecialidade(rset.getString("especialidade"));

				// Mostrar os horários de trabalho
				cabelereiro.setHorariosDeTrabalho(rset.getString("horariosDeTrabalho"));

				cabeleireiros.add(cabelereiro);
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

		return cabeleireiros;
	}
}