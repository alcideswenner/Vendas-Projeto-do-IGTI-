package com.alcideswenner.vendas.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alcideswenner.vendas.DTO.ComprasDTO;
import com.alcideswenner.vendas.entities.Compras;
import com.alcideswenner.vendas.repositories.ComprasRepository;

@Service
public class ComprasService {
	@Autowired
	private ComprasRepository comprasRepository;
	
	public List<ComprasDTO> findAll() {
		List<Compras>res=comprasRepository.findAll();
		return res.stream().map(c->new ComprasDTO(c)).collect(Collectors.toList());
	}
}
