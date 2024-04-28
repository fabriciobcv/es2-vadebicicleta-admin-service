package com.es2.groupC.vadebicicletamanutencaoservice.api;

import com.es2.groupC.vadebicicletamanutencaoservice.domain.dto.BicicletaDTO;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bicicleta")
public class BicicletaController {

    @GetMapping("/")
    public ResponseEntity<List<BicicletaDTO>> listarBicicletas(){
       List<BicicletaDTO> bicicletasDTO = new ArrayList<>();;
       return new ResponseEntity<>(bicicletasDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerBicicleta(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/")
    public ResponseEntity<BicicletaDTO> adicionarBicicleta(@RequestBody BicicletaDTO bicicletaASerCadastrada){
        return new ResponseEntity<>(bicicletaASerCadastrada, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BicicletaDTO> atualizarBicicleta(@PathVariable Long id, @RequestBody BicicletaDTO bicicletaASerAtualizada){
        return new ResponseEntity<>(bicicletaASerAtualizada, HttpStatus.OK);
    }
}
