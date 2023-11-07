package edu.java.src.domain;
import java.util.Objects;
/** @author maxdev
 * Representa um cliente com informações como nome, CPF, telefone, endereço, número, cidade e estado.*/
public class Cliente {
//    Atributos
    private String nome;
    private Long cpf;
    private Long tel;
    private String endereco;
    private Integer numero;
    private String cidade;
    private String estado;
//    Construtor
    /** Cria um objeto Cliente com os detalhes fornecidos.
     *
     * @param nome          O nome do cliente.
     * @param cpf           O número de CPF do cliente.
     * @param tel           O número de telefone do cliente.
     * @param end(endereco) O endereço do cliente.
     * @param num(numero)   O número do endereço.
     * @param cidade        A cidade onde o cliente reside.
     * @param estado        O estado onde o cliente reside.
     */
    public Cliente(String nome, String cpf, String tel, String end, String num, String cidade, String estado) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf.trim());
        this.tel = Long.valueOf(tel.trim());
        this.endereco = end;
        this.numero = Integer.valueOf(num.trim());
        this.cidade = cidade;
        this.estado = estado;
    }
//    Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public Long getTel() {
        return tel;
    }
    public void setTel(Long tel) {
        this.tel = tel;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
//    Equals
    /** Verifica se este cliente é igual a outro objeto com base no número de CPF.
     *
     * @param o O objeto a ser comparado.
     * @return true se os objetos são iguais com base no número de CPF, false caso contrário.*/
    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cliente cliente = (Cliente) o;
    return Objects.equals(getCpf(), cliente.getCpf());
}
//    HashCode
    /** Retorna um código hash com base no número de CPF.
     *
     * @return O código hash gerado.*/
    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }
//    toString
    /** Retorna uma representação em formato de string do objeto Cliente.
     *
     * @return Uma string que representa o objeto Cliente.*/
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}