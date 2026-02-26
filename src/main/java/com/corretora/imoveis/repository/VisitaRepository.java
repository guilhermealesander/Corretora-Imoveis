package com.corretora.imoveis.repository;

import com.corretora.imoveis.domain.StatusVisita;
import com.corretora.imoveis.domain.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitaRepository extends JpaRepository<Visita, Long> {
    List<Visita> findByStatus(StatusVisita status);
    List<Visita> findByClienteId(Long clienteId);
    List<Visita> findByImovelId(Long imovelId);
}