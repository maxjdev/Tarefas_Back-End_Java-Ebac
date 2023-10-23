package edu.java.maxjdev;
import java.util.*;
/**
 * @author maxdev
 * Primeiro intanciamento do Scanner e HashMaps, input do usuario com nomes+sexo na formatação: Joao-M
 * faz uma primeira separação dos nomes, usa um foreach para percorrer os nomes no array e separar nome do sexo com split(-),
 * usa um if para direcionar os nomes masculinos e femininos aos respectivos HashMaps e ao final imprime tudo.
 */
public class SeparacaoPorSexo {
    public static void main(String[] args) {
//        Instanciando Scanner e os HashMaps de nomes
        Scanner scan = new Scanner(System.in);
        Map<String, Pessoa> nomesMasculinos = new HashMap<>();
        Map<String, Pessoa> nomesFemininos = new HashMap<>();
//        Input de nome+sexo
        System.out.println("-----***** Exercitando Collections e Map *****-----");
        System.out.println("*** Digite um nome e a inicial do sexo separados por um traço e virgula para nomes ***");
        System.out.println("Exemplo: Maria-F,Joao-M,Clara-F,Rafael-M");
        System.out.print("R: ");
        String nomes = scan.nextLine();
        scan.close();
//        Primeira separação com split por virgula
        String[] primeiraSeparacao = nomes.split(",");
//        Segunda separação com split usando traço dentro de um for para percorrer primeiraSepracao
        for (String nomeSexo : primeiraSeparacao) {
            String[] segundaSeparacao = nomeSexo.split("-");
            String nome = segundaSeparacao[0];
            String sexo = segundaSeparacao[1];
//            Separação de sexos e atribuição ao Map adequado
            if (sexo.equalsIgnoreCase("m")) {
                nomesMasculinos.put(nome, new Pessoa(nome));
            } else if (sexo.equalsIgnoreCase("f")) {
                nomesFemininos.put(nome, new Pessoa(nome));
            }
        }
//        Exibe nomes masculinos
        System.out.println("\n-----***** Nomes Masculinos *****-----");
        for (String nome: nomesMasculinos.keySet()) {
            System.out.println(nome);
        }
//        Exibe nomes femininos
        System.out.println("\n-----***** Nomes Femininos *****-----");
        for (String nome: nomesFemininos.keySet()) {
            System.out.println(nome);
        }
    }
}
