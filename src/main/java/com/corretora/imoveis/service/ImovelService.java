package com.corretora.imoveis.service;

import com.corretora.imoveis.domain.Imovel;
import com.corretora.imoveis.domain.StatusImovel;
import com.corretora.imoveis.dto.ImovelRequest;
import com.corretora.imoveis.exception.NotFoundException;
import com.corretora.imoveis.repository.ImovelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImovelService {

    private final ImovelRepository repository;

    public Imovel criar(ImovelRequest req) {
        var imovel = Imovel.builder()
                .tipo(req.tipo())
                .status(StatusImovel.DISPONIVEL)
                .endereco(req.endereco())
                .areaM2(req.areaM2())
                .preco(req.preco())
                .quartos(req.quartos())
                .banheiros(req.banheiros())
                .build();
        return repository.save(imovel);
    }

    public Imovel buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Imóvel " + id + " não encontrado"));
    }

    public List<Imovel> listar() {
        return repository.findAll();
    }

    public Imovel atualizarStatus(Long id, StatusImovel status) {
        var imovel = buscar(id);
        imovel.setStatus(status);
        return repository.save(imovel);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Imóvel " + id + " não encontrado");
        }
        repository.deleteById(id);
    }
}