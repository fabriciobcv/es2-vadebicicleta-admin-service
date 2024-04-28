package com.es2.groupC.vadebicicletamanutencaoservice.api;

import com.es2.groupC.vadebicicletamanutencaoservice.domain.dto.TrancaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tranca")
public class TrancaController {

    @GetMapping("/")
    public ResponseEntity<List<TrancaDTO>> listarTrancas(){
        List<TrancaDTO> trancasDTO = new ArrayList<>();;
        return new ResponseEntity<>(trancasDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerTranca(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/")
    public ResponseEntity<TrancaDTO> adicionarTranca(@RequestBody TrancaDTO trancaASerCadastrada){
        return new ResponseEntity<>(trancaASerCadastrada, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TrancaDTO> atualizarTranca(@PathVariable Long id, @RequestBody TrancaDTO trancaASerAtualizada){
        return new ResponseEntity<>(trancaASerAtualizada, HttpStatus.OK);
    }
}
