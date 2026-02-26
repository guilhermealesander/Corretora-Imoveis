package com.corretora.imoveis.controller;

import com.corretora.imoveis.domain.Cliente;
import com.corretora.imoveis.dto.ClienteRequest;
import com.corretora.imoveis.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente criar(@RequestBody @Valid ClienteRequest req) {
        return service.criar(req);
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}