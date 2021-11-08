package com.alcideswenner.vendas.DTO;

import com.alcideswenner.vendas.entities.Cliente;

public class RankingComprasDTO {
	private String nome;
	private Double valorTotal;

	public RankingComprasDTO(Cliente cliente, Double valorTotal) {
		this.nome = cliente.getNome();
		this.valorTotal = valorTotal;
	}

	public RankingComprasDTO() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
