package edu.java.maxjdev.abstracts;
/**
 * @author maxdev
 * Classe Abstrata para Pessoa com Atributos, Construtor e Getters Nome && Sobrenome (Setters removidos por não serem utilizados no contexto do exercicio)
 */
public abstract class Pessoa {
//    Atributos
    private final String nome;
    private final String sobrenome;
//    Construtor
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome= sobrenome;
    }
//    Getters
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
}
