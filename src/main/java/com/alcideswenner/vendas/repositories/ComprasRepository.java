package com.alcideswenner.vendas.repositories;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.alcideswenner.vendas.DTO.RankingComprasDTO;
import com.alcideswenner.vendas.entities.Compras;

public interface ComprasRepository extends JpaRepository<Compras, Integer> {
  @Query("SELECT new com.alcideswenner.vendas.DTO.RankingComprasDTO(compras.cliente, SUM(compras.totalCompra)) "
  		+ "FROM Compras AS compras GROUP BY compras.cliente ORDER BY SUM(compras.totalCompra) DESC")
  List<RankingComprasDTO>findRanking();
}
