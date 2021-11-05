package com.alcideswenner.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alcideswenner.vendas.DTO.ClienteDTO;
import com.alcideswenner.vendas.entities.Cliente;
import com.alcideswenner.vendas.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<ClienteDTO> findAll() {
		List<Cliente>res=clienteRepository.findAll();
		return res.stream().map(c->new ClienteDTO(c)).collect(Collectors.toList());
	}



}
