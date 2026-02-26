package com.corretora.imoveis.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "imoveis")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoImovel tipo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusImovel status;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private Integer areaM2;

    @Column(nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private Integer quartos;

    @Column(nullable = false)
    private Integer banheiros;
}
