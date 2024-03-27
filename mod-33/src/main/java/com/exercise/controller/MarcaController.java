package com.exercise.controller;

import com.exercise.domain.model.Carro;
import com.exercise.domain.model.Marca;
import com.exercise.service.impl.MarcaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
@Tag(name = "Controller de marca", description = "Endpoints para marca")
public class MarcaController {
    private final MarcaService service;

    public MarcaController(MarcaService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Lista todas as marcas")
    public List<Marca> listarAcessorios() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca marca por ID")
    public ResponseEntity<Marca> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    @Operation(summary = "Cria nova marca")
    public ResponseEntity<Marca> save(@RequestBody Marca marca) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(marca));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove marca por ID")
    public ResponseEntity<Marca> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/carrosEmMarca/{id}")
    @Operation(summary = "Adiciona carro a marca")
    public ResponseEntity<Marca> addCarro(@PathVariable Long id, @RequestBody Carro carro) {
        return ResponseEntity.ok(service.add(id, carro));
    }

    @DeleteMapping("/carrosEmMarca/{id}")
    @Operation(summary = "Remove carro de marca")
    public ResponseEntity<Marca> removeCarro(@PathVariable Long id, @RequestBody Carro carro) {
        return ResponseEntity.ok(service.remove(id, carro));
    }
}
