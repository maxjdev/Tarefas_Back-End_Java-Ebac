package com.exercise.controller;

import com.exercise.domain.model.Acessorio;
import com.exercise.domain.model.Carro;
import com.exercise.service.impl.CarroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
@Tag(name = "Controller de carros", description = "Endpoints para carros")
public class CarroController {
    private final CarroService service;

    public CarroController(CarroService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Lista todos os carros")
    public ResponseEntity<List<Carro>> listarAcessorios() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca carro por ID")
    public ResponseEntity<Carro> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    @Operation(summary = "Cria novo carro")
    public ResponseEntity<Carro> save(@RequestBody Carro carro) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(carro));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove acessorio por ID")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/acessoriosEmCarro/{id}")
    @Operation(summary = "Adiciona acessorio a carro")
    public ResponseEntity<Carro> addAcessorio(@PathVariable Long id, @RequestBody Acessorio acessorio) {
        return ResponseEntity.ok(service.add(id, acessorio));
    }

    @DeleteMapping("/acessoriosEmCarro/{id}")
    @Operation(summary = "Remove acessorio de carro")
    public ResponseEntity<Carro> removeAcessorio(@PathVariable Long id, @RequestBody Acessorio acessorio) {
        return ResponseEntity.ok(service.remove(id, acessorio));
    }
}
