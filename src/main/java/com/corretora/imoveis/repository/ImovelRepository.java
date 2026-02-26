package com.corretora.imoveis.repository;

import com.corretora.imoveis.domain.Imovel;
import com.corretora.imoveis.domain.StatusImovel;
import com.corretora.imoveis.domain.TipoImovel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
    List<Imovel> findByStatus(StatusImovel imovel);
    List<Imovel> findByTipoAndPrecoBetween(TipoImovel tipo, BigDecimal min, BigDecimal max);
}

