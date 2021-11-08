package com.alcideswenner.vendas.DTO;
import java.time.LocalDate;
import com.alcideswenner.vendas.entities.Compras;

public class ComprasDTO {
	
	private int id;
	private Double totalCompra;
	private LocalDate dataCompra;
	
	private ClienteDTO cliente;//adicionei

	public ComprasDTO(Compras entidade) {
		this.id = entidade.getId();
		this.totalCompra = entidade.getTotalCompra();
		this.dataCompra = entidade.getDataCompra();
		this.cliente=new ClienteDTO(entidade.getCliente());//adicionei
	}
		
	public ComprasDTO(int id, Double totalCompra, LocalDate dataCompra,ClienteDTO cliente) {//adicionei
		this.id = id;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
		this.cliente=cliente;//adicionei
	}
	
	public ComprasDTO() {//adicionei

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

	public ClienteDTO getCliente() {//adicionei
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {//adicionei
		this.cliente = cliente;
	}

	
}
