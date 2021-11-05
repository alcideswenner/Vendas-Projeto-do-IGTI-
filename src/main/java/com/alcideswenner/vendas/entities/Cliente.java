package com.alcideswenner.vendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")//create table tb_cliente
public class Cliente {//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//incremento
	private int id;
	private String nome;
	private String dn;
	
	@OneToMany(mappedBy = "cliente")
	private List<Compras>compras=new ArrayList<>();
	
	public Cliente(int id, String nome, String dn) {
		this.id = id;
		this.nome = nome;
		this.dn = dn;
	}
     
	public Cliente() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDn() {
		return dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}
	
	
}
