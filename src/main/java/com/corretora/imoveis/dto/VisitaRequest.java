package com.corretora.imoveis.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record VisitaRequest(
        @NotNull Long clienteId,
        @NotNull Long imovelId,
        @NotNull LocalDateTime dataHora,
        String observacao
) {}
