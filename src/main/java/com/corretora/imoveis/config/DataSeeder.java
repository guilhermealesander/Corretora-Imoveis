package com.corretora.imoveis.config;

import com.corretora.imoveis.domain.*;
import com.corretora.imoveis.repository.ClienteRepository;
import com.corretora.imoveis.repository.ImovelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final ClienteRepository clienteRepository;
    private final ImovelRepository imovelRepository;

    @Override
    public void run(String... args) {
        if (clienteRepository.count() == 0) {
            clienteRepository.save(Cliente.builder()
                    .nome("Guilherme Alesander")
                    .email("gui@email.com")
                    .telefone("81999990000")
                    .build());
        }

        if (imovelRepository.count() == 0) {
            imovelRepository.save(Imovel.builder()
                    .tipo(TipoImovel.APARTAMENTO)
                    .status(StatusImovel.DISPONIVEL)
                    .endereco("Av. Boa Viagem, Recife - PE")
                    .areaM2(72)
                    .preco(new BigDecimal("420000.00"))
                    .quartos(2)
                    .banheiros(2)
                    .build());
        }

        if (clienteRepository.count() == 1) {
            clienteRepository.save(Cliente.builder()
                    .nome("Batman")
                    .email("bat_man@gmail.com")
                    .telefone("81978964528")
                    .build());
        }
        if (imovelRepository.count() == 1) {
            imovelRepository.save(Imovel.builder()
                    .tipo(TipoImovel.CASA)
                    .status(StatusImovel.VENDIDO)
                    .endereco("Av. Batcaverna, Recife - PE")
                    .areaM2(72)
                    .preco(new BigDecimal("5230000.00"))
                    .quartos(3)
                    .banheiros(2)
                    .build());
        }
    }
}