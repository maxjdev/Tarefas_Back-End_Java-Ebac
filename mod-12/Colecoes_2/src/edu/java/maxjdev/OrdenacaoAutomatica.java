package edu.java.maxjdev;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * @author maxdev
 * Scaneia input[String] do usuario,usa split para separar nomes,
 * atribui ao TreeMap que ordena naturalmente e imprime
 */
public class OrdenacaoAutomatica {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        /*
            ----- * Ordenação natural do TreeMap
         */
//        Recebendo inputs
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----****** Exercitando Ordenação Automática com TreeMap ******-----");
        System.out.println("Escreva uma sequencia de nomes separando por uma vírgula: ");
        System.out.print("R: ");
        String nomes = scan.nextLine();
//        Separando Nomes
        String[] separacaoDeNomes = nomes.split(",");
//        Atribuindo nomes ao Map como chave e instanciando uma nova Pessoa com um foreach
        Map<String, Pessoa> nomesOrdenados = new TreeMap<>();
        for (String names : separacaoDeNomes) {
            nomesOrdenados.put(names, new Pessoa(names));
        }
//        Imprimindo nomes ordenados pelo TreeMap
        System.out.println("-----****** Nomes Ordenados pelo TreeMap******-----");
        for (String names : nomesOrdenados.keySet()) {
            System.out.println(names);
        }
        scan.close();
    }
}