package edu.java.maxjdev;
/**
 * @author maxdev
 * Classe recebe 4 notas, construtor, getters e setters, metodo para somar 4 doubles e metodo para calcular media das notas
 */
public class SistemaDeNotas {
//    Atributos
    private final double nota1;
    private final double nota2;
    private final double nota3;
    private final double nota4;
    private double somaDasNotas;
    private double mediaFinal;
//    Construtor
    public SistemaDeNotas(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
//    Getters & Setters
    public double getSomaDasNotas() {
        return somaDasNotas;
    }
    public void setSomaDasNotas(double somaDasNotas) {
        this.somaDasNotas = somaDasNotas;
    }
    public double getMediaFinal() {
        return mediaFinal;
    }
    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
//    Metodos
    public void somarNotas() {
        setSomaDasNotas(this.nota1+this.nota2+this.nota3+this.nota4);
    }
    public void calcularMediaFinal() {
        setMediaFinal(getSomaDasNotas()/4);
    }
}
