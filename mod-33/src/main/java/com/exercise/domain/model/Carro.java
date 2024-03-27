package com.exercise.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "tb_carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String modelo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    @ManyToMany
    @JoinTable(name = "carro_acessorio",
            joinColumns = @JoinColumn(name = "carro_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "acessorio_id", referencedColumnName = "id")
    )
    private List<Acessorio> acessorios = new ArrayList<>();

    public void addAcessorio(Acessorio acessorio) {
        this.acessorios.add(acessorio);
    }

    public void removeAcessorio(Acessorio acessorio) {
        this.acessorios.remove(acessorio);
    }
}
