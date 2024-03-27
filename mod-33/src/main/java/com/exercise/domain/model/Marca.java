package com.exercise.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "tb_marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Carro> carros;

    public void addCarro(Carro carro) {
        this.carros.add(carro);
    }

    public void removeCarro(Carro carro) {
        this.carros.remove(carro);
    }
}