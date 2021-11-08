package com.alcideswenner.vendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_compras")
public class Compras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//incremento
	private int id;
	private Double totalCompra;
	private LocalDate dataCompra;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")//chave estrangeira
	private Cliente cliente;//relacionadas a um cliente
	
	public Compras(int id, Double totalCompra, LocalDate dataCompra,Cliente cliente) {//adicionei
		this.id = id;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
		this.cliente=cliente;//adicionei
	}
	
	public Compras() {

	}
	
	public Compras(int id) {//adicionei

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Cliente getCliente() {//adicionei
		return cliente;
	}

	public void setCliente(Cliente cliente) {//adicionei
		this.cliente = cliente;
	}
	
	
	
	
	
}
