package edu.java.maxjdev.pforpj;
import edu.java.maxjdev.abstracts.Pessoa;
/**
 * @author maxdev
 * Classe Concreta para pessoa juridica que extende da classe abstrata Pessoa, recebe CNPJ como atributo,
 * Construtor, Getter (Setter removido por não ser utilizado no contexto do exercicio) e toString
 */
public class PessoaJuridica extends Pessoa {
//    Atributos
    private final String cnpj;
//    Construtor
    public PessoaJuridica(String nome, String sobrenome, String cnpj) {
        super(nome, sobrenome);
        this.cnpj = cnpj;
    }
//    Getters && Setters(Setters removidos por não serem utilizados no contexto do exercicio)
    public String getCnpj() {
        return cnpj;
    }
//    ToString
    public String toString() {
        return "Cliente PJ Nome: " + getNome() + " " + getSobrenome() + " - CNPJ: " + getCnpj();
    }
}
