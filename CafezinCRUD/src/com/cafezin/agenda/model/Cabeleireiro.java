package com.cafezin.agenda.model;

import java.util.Date;

public class Cabeleireiro {

	private int idCabeleireiro, anosProfissao;
	private String nome, especialidade, horariosDeTrabalho;
	private Date dataNasc;

	public int getIdCabeleireiro() {
		return idCabeleireiro;
	}

	public void setIdCabeleireiro(int idCabeleireiro) {
		this.idCabeleireiro = idCabeleireiro;
	}

	public int getAnosProfissao() {
		return anosProfissao;
	}

	public void setAnosProfissao(int anosProfissao) {
		this.anosProfissao = anosProfissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getHorariosDeTrabalho() {
		return horariosDeTrabalho;
	}

	public void setHorariosDeTrabalho(String horariosDeTrabalho) {
		this.horariosDeTrabalho = horariosDeTrabalho;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return this.getNome();
	}
}
