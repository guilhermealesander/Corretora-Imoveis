package com.corretora.imoveis.controller;

import com.corretora.imoveis.domain.StatusVisita;
import com.corretora.imoveis.domain.Visita;
import com.corretora.imoveis.dto.VisitaRequest;
import com.corretora.imoveis.service.VisitaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitas")
@RequiredArgsConstructor
public class VisitaController {

    private final VisitaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Visita agendar(@RequestBody @Valid VisitaRequest req) {
        return service.agendar(req);
    }

    @GetMapping
    public List<Visita> listar() {
        return service.listar();
    }

    @PatchMapping("/{id}/status")
    public Visita alterarStatus(@PathVariable Long id, @RequestParam StatusVisita status) {
        return service.alterarStatus(id, status);
    }
}