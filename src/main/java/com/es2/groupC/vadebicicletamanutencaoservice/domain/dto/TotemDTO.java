package com.es2.groupC.vadebicicletamanutencaoservice.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class TotemDTO {
    private String numero;
    private String localizacao;

    private TotemDTO(){super();};
}
