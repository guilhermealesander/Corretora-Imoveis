package com.corretora.imoveis.service;

import com.corretora.imoveis.domain.Cliente;
import com.corretora.imoveis.dto.ClienteRequest;
import com.corretora.imoveis.exception.NotFoundException;
import com.corretora.imoveis.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente criar(ClienteRequest req) {
        var cliente = Cliente.builder()
                .nome(req.nome())
                .email(req.email())
                .telefone(req.telefone())
                .build();
        return repository.save(cliente);
    }

    public Cliente buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cliente " + id + " não encontrado"));
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Cliente " + id + " não encontrado");
        }
        repository.deleteById(id);
    }
}