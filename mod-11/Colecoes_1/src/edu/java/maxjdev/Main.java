package edu.java.maxjdev;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Declara Scanner e Lists, while para decidir quando parar os inputs, dentro do while os inputs são separados pelo split
 * que divide nome e sexo, caso masc vai para lista de nomes masculinos e o mesmo se aplica aos nomes femininos
 * e ao fim exibe os nomes masculinos e femininos separados
 * @author maxdev
 */
public class Main {
    public static void main(String[] args) {
//        Declarações
        Scanner scan = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();
//        Loop para ter quantos inputs forem necessarios
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----***** Exercitando Java Collections *****-----");
            System.out.println("*** Digite o primeiro nome e o sexo separados por um espaço e sem virgulas ou pontos ***");
            System.out.println("ex: Jon Masculino");
            System.out.print("R: ");
            String input = scan.nextLine();
//            Separa nome e sexo
            String[] nomeSexo = input.split(" ");
            String nome = nomeSexo[0];
            String sexo = nomeSexo[1];
            if (sexo.equalsIgnoreCase("masculino")) {
                nomesMasculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("feminino")) {
                nomesFemininos.add(nome);
            }
//            Verifica se o loop continua ou para
            System.out.println("--------------------------------------------------------");
            System.out.println("Quer adicionar uma nova pessoa digite SIM, caso não queira digite NÃO");
            System.out.print("R: ");
            String continuarOuNao = scan.nextLine();
            if (continuarOuNao.equalsIgnoreCase("nao") || continuarOuNao.equalsIgnoreCase("não")) {
                break;
            }
        } scan.close();
//        Exibe nomes masculinos
        System.out.println("\n___* * * * * OUTPUT * * * * *___");
        System.out.println("--------------------------------------------------------");
        System.out.println("* * * Nomes Masculinos * * * ");
        for (String nomes:nomesMasculinos) {
            System.out.println(nomes);
        }
//        Exibe nomes femininos
        System.out.println("--------------------------------------------------------");
        System.out.println("* * * Nomes Femininos * * * ");
        for (String nomes:nomesFemininos) {
            System.out.println(nomes);
        }
    }
}
