package com.corretora.imoveis.controller;

import com.corretora.imoveis.domain.Imovel;
import com.corretora.imoveis.domain.StatusImovel;
import com.corretora.imoveis.dto.ImovelRequest;
import com.corretora.imoveis.service.ImovelService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/imoveis")
@RequiredArgsConstructor
public class ImovelController {

    private final ImovelService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Imovel criar(@RequestBody @Valid ImovelRequest req) {
        return service.criar(req);
    }

    @GetMapping("/{id}")
    public Imovel buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @GetMapping
    public List<Imovel> listar() {
        return service.listar();
    }

    @PatchMapping("/{id}/status")
    public Imovel atualizarStatus(@PathVariable Long id, @RequestParam StatusImovel status) {
        return service.atualizarStatus(id, status);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}