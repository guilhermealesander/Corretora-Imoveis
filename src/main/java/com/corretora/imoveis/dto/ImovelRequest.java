package com.corretora.imoveis.dto;

import com.corretora.imoveis.domain.TipoImovel;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ImovelRequest(
        @NotNull TipoImovel tipo,
        @NotBlank String endereco,
        @NotNull @Min(1) Integer areaM2,
        @NotNull BigDecimal preco,
        @NotNull @Min(0) Integer quartos,
        @NotNull @Min(0) Integer banheiros
){}
