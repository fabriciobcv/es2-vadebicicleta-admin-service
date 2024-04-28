package com.es2.groupC.vadebicicletamanutencaoservice.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class FuncionarioDTO {

    private String matricula;
    private String email;
    private String nome;
    private Integer idade;
    private String funcao;
    private String CPF;

    private FuncionarioDTO(){super();}
}

