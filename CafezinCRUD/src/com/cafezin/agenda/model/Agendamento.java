package com.cafezin.agenda.model;

public class Agendamento {

	private int idAgenda, valor, idCabelereiro, idCliente;
	private String hora, dataAgenda, servico, formaPagamento, statusPG;

	private Cabeleireiro cabeleireiro;

	private Cliente cliente;

	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getIdCabelereiro() {
		return idCabelereiro;
	}

	public void setIdCabelereiro(int idCabelereiro) {
		this.idCabelereiro = idCabelereiro;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDataAgenda() {
		return dataAgenda;
	}

	public void setDataAgenda(String dataAgenda) {
		this.dataAgenda = dataAgenda;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getStatusPG() {
		return statusPG;
	}

	public void setStatusPG(String statusPG) {
		this.statusPG = statusPG;
	}

	public Cabeleireiro getCabeleireiro() {
		return cabeleireiro;
	}

	public void setCabeleireiro(Cabeleireiro cabeleireiro) {
		this.cabeleireiro = cabeleireiro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
