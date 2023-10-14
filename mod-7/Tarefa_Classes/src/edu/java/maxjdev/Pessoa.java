package edu.java.maxjdev;

public class Pessoa {
    /** ---Atributos--- */
    private String nome;
    private float altura;
    private byte idade;
    /**
     * Por não ser necessario tantos bits para receber uma idade optei por usar byte ao inves de int,
     * e o mesmo se aplica a altura com float ao inves de double.
     * @see idade
     * @see altura
     */

    /** ---Construtor--- */
    public Pessoa(String nome, float altura, byte idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
    /**
     * nome = nome da pessoa
     * altura = altura da pessoa
     * idade = idade da pessoa
     * @param nome
     * @param altura
     * @param idade
     */
    /** ---Getters & Setters--- */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    /** ---Metodos--- */
    public void andar() {
        System.out.println("Andando...");
    }

    public void comer(String alimento) {
        System.out.println(this.nome + " está comendo " + alimento);
    }
    /**
     * Nome do alimento a ser oferecido
     * @param alimento
     * --------------------------------------------------
     * @author maxjdev
     */
}
