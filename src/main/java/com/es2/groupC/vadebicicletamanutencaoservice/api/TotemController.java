package com.es2.groupC.vadebicicletamanutencaoservice.api;

import com.es2.groupC.vadebicicletamanutencaoservice.domain.dto.FuncionarioDTO;
import com.es2.groupC.vadebicicletamanutencaoservice.domain.dto.TotemDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/totem")
public class TotemController {
    @GetMapping("/")
    public ResponseEntity<List<TotemDTO>> listarTotens(){
        List<TotemDTO> totensDTO = new ArrayList<>();;
        return new ResponseEntity<>(totensDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerTotem(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/")
    public ResponseEntity<TotemDTO> adicionarTotem(@RequestBody TotemDTO totemASerCadastrada){
        return new ResponseEntity<>(totemASerCadastrada, HttpStatus.CREATED);
    }


    @GetMapping("/{id}/bicicletas")
    public ResponseEntity<List> listarBicicletasDoTotem(@PathVariable Long id){
        ArrayList bicicletasTotem = new ArrayList<>();
        return new ResponseEntity<>(bicicletasTotem, HttpStatus.OK);
    }

    @GetMapping("/{id}/trancas")
    public ResponseEntity<List> listarTrancasDoTotem(@PathVariable Long id){
        ArrayList trancasTotem = new ArrayList<>();
        return new ResponseEntity<>(trancasTotem, HttpStatus.OK);
    }
}
