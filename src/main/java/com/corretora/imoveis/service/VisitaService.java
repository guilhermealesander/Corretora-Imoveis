package com.corretora.imoveis.service;

import com.corretora.imoveis.domain.StatusVisita;
import com.corretora.imoveis.domain.Visita;
import com.corretora.imoveis.dto.VisitaRequest;
import com.corretora.imoveis.exception.NotFoundException;
import com.corretora.imoveis.repository.ClienteRepository;
import com.corretora.imoveis.repository.ImovelRepository;
import com.corretora.imoveis.repository.VisitaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitaService {

    private final VisitaRepository visitaRepository;
    private final ClienteRepository clienteRepository;
    private final ImovelRepository imovelRepository;

    public Visita agendar(VisitaRequest req) {
        var cliente = clienteRepository.findById(req.clienteId())
                .orElseThrow(() -> new NotFoundException("Cliente " + req.clienteId() + " não encontrado"));
        var imovel = imovelRepository.findById(req.imovelId())
                .orElseThrow(() -> new NotFoundException("Imóvel " + req.imovelId() + " não encontrado"));

        var visita = Visita.builder()
                .cliente(cliente)
                .imovel(imovel)
                .dataHora(req.dataHora())
                .status(StatusVisita.AGENDADA)
                .observacao(req.observacao())
                .build();

        return visitaRepository.save(visita);
    }

    public List<Visita> listar() {
        return visitaRepository.findAll();
    }

    public Visita alterarStatus(Long id, StatusVisita status) {
        var visita = visitaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Visita " + id + " não encontrada"));
        visita.setStatus(status);
        return visitaRepository.save(visita);
    }
}