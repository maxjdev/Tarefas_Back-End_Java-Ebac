package com.exercise.domain.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "tb_acessorio")
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros = new ArrayList<>();

    public void addCarro(Carro carro) {
        this.carros.add(carro);
    }

    public void removeCarro(Carro carro) {
        this.carros.remove(carro);
    }
}
