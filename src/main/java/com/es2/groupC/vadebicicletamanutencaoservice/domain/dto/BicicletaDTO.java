package com.es2.groupC.vadebicicletamanutencaoservice.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class BicicletaDTO {

    private String numero;
    private String marca;
    private String modelo;
    private String ano;
    private String status;
    private String localizacao;

    private BicicletaDTO(){super();}
}
