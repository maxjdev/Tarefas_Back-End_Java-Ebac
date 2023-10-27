package edu.java.maxjdev.pforpj;
import edu.java.maxjdev.abstracts.Pessoa;
/**
 * @author maxdev
 * Classe Concreta para pessoa fisica que extende da classe abstrata Pessoa, recebe CPF como atributo,
 * Construtor, Getter (Setter removido por não ser utilizado no contexto do exercicio) e toString
 */
public class PessoaFisica extends Pessoa {
//    Atributos
    private final String cpf;
//    Construtor
    public PessoaFisica(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome);
        this.cpf = cpf;
    }
//    Getters && Setteres(Setters removidos por não serem utilizados no contexto do exercicio)
    public String getCpf() {
        return cpf;
    }
//    ToString
    public String toString() {
        return "Cliente PF Nome: " + getNome() + " " + getSobrenome() + " - CPF: " + getCpf();
    }
}
