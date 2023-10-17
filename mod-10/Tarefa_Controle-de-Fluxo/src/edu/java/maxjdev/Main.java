package edu.java.maxjdev;
import java.util.Random;
import java.util.Scanner;
/**
 * @author maxdev
 * Classe define input de dados para posteriormente ser atribuido a um array de double dentro de um for
 * com validação de nota minima e maxima, passado como argumento para o construtor,
 * chamado metodos para soma e media das notas e ao fim um if valida se foi aprovado (>=7), recuperação (>=5) e
 * reprovado (<=4) e no fim exibe um retorno no console
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[4];
//        Atribuição da var "opt"
        System.out.println("__________________________________________________________");
        System.out.println(" * * * * * BEM VINDO AO SISTEMA DE NOTAS * * * * * \n");
        System.out.println("Digite 1 para receber valores aleatorios para as 4 notas ! (caso de preguiça para digitar manualmente)");
        System.out.println("Digite 2 para digitar manualmente as 4 notas !");
        System.out.print("R: ");
        int opt = scan.nextInt();
        System.out.println("__________________________________________________________");
//        Switch para input de notas manual ou automático
        switch (opt) {
            case 1:
                System.out.println(" * * * * * NOTAS ALEATORIAS (Math.random) * * * * * ");
                for (int i = 0; i < notas.length; i++) {
                    notas[i] = new Random().nextInt(11);
                    System.out.println("\nA " + (i+1) + "° nota foi sorteada= [" + notas[i] + "] !");
                }
                break;
            case 2:
//                Definição do array, input de notas e validação
                System.out.println(" * * * * * INSERIR NOTAS * * * * * \n");
                for (int i = 0; i < notas.length; i++) {
                    System.out.print("Digite a " + (i + 1) + "° nota\n");
                    double nota = scan.nextDouble();

                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota invalida ! Digite valores entre 0 e 10 e use ',' para notas decimais");
                        i--;
                    } else {
                        notas[i] = nota;
                    }
                }
        }
        scan.close();
//        Chamando metodos para realizar soma e media
        System.out.println("\n---------------------");
        System.out.println("* * * Calculando notas... * * *");
        System.out.println("---------------------");
        SistemaDeNotas sistemaDeNotas = new SistemaDeNotas(notas[0], notas[1], notas[2], notas[3]);
        sistemaDeNotas.somarNotas();
        sistemaDeNotas.calcularMediaFinal();
//        Retorno de aprovação ou reprovação
        System.out.println("\n__________________________________________________________");
        System.out.println(" * * * * * MÉDIA FINAL * * * * * ");
        if (sistemaDeNotas.getMediaFinal() >= 7) {
            System.out.println("\nParabéns você foi aprovado !");
            System.out.println("\nMédia final: " + String.format("%.1f", sistemaDeNotas.getMediaFinal()));
        } else if (sistemaDeNotas.getMediaFinal() >= 5) {
            System.out.println("\nVocê está de recuperação !");
            System.out.println("Entre em contato com o tutor para realizar o agendamento da prova !");
            System.out.println("\nMédia final: " + String.format("%.1f", sistemaDeNotas.getMediaFinal()));
        } else {
            System.out.println("\nVocê foi reprovado !");
            System.out.println("\nMédia final: " + String.format("%.1f", sistemaDeNotas.getMediaFinal()));
        }
        System.out.println("______________________FIM !!!_____________________________");

    }
}