package com.es2.groupC.vadebicicletamanutencaoservice.api;

import com.es2.groupC.vadebicicletamanutencaoservice.domain.dto.FuncionarioDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
    @GetMapping("/")
    public ResponseEntity<List<FuncionarioDTO>> listarFuncionarios(){
        List<FuncionarioDTO> funcionariosDTO = new ArrayList<>();;
        return new ResponseEntity<>(funcionariosDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerFuncionario(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/")
    public ResponseEntity<FuncionarioDTO> adicionarFuncionario(@RequestBody FuncionarioDTO funcionarioASerCadastrada){
        return new ResponseEntity<>(funcionarioASerCadastrada, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> atualizarFuncionario(@PathVariable Long id, @RequestBody FuncionarioDTO funcionarioASerAtualizada){
        return new ResponseEntity<>(funcionarioASerAtualizada, HttpStatus.OK);
    }
}
