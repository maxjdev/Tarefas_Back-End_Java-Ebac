package com.exercise.controller;

import com.exercise.domain.model.Acessorio;
import com.exercise.domain.model.Carro;
import com.exercise.service.impl.AcessorioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acessorio")
@Tag(name = "Controller de acessorios", description = "Endpoints para acessorios")
public class AcessorioController {
    private final AcessorioService service;

    public AcessorioController(AcessorioService acessorioService) {
        this.service = acessorioService;
    }

    @GetMapping
    @Operation(summary = "Lista todos os acessórios")
    public ResponseEntity<List<Acessorio>> listarAcessorios() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca acessorio por ID")
    public ResponseEntity<Acessorio> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    @Operation(summary = "Cria novo acessorio")
    public ResponseEntity<Acessorio> save(@RequestBody Acessorio acessorio) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(acessorio));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove acessorio por ID")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/carrosEmAcessorio/{id}")
    @Operation(summary = "Adiciona carro a acessorio")
    public ResponseEntity<Acessorio> addCarro(@PathVariable Long id, @RequestBody Carro carro) {
        return ResponseEntity.ok(service.add(id, carro));
    }

    @DeleteMapping("/carrosEmAcessorio/{id}")
    @Operation(summary = "Remove carro de acessorio")
    public ResponseEntity<Acessorio> removeCarro(@PathVariable Long id, @RequestBody Carro carro) {
        return ResponseEntity.ok(service.remove(id, carro));
    }
}
