package com.es2.groupC.vadebicicletamanutencaoservice.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class TrancaDTO {

    private String numero;
    private String status;
    private String localizacao;
    private String ano;
    private String modelo;

    public TrancaDTO(){super();}
}
