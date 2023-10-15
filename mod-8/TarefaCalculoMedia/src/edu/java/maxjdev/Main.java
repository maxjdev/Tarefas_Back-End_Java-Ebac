package edu.java.maxjdev;
import java.util.Scanner;
/**
 * @author maxdev
 * Classe define input de dados para posteriormente ser atribuido a um array de double dentro de um for
 * com validação de nota minima e maxima, passado como argumento para o construtor,
 * chamado metodos para soma e media das notas e ao fim um if valida se foi aprovado (=> 7) ou reprovado (=< 6) e
 * exibe um retorno no console
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /** Definição do array, input de notas e validação */
        System.out.println("\n__________________________________________________________");
        System.out.println(" * * * * * NOTAS * * * * * ");
        double[] notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i + 1) + "° nota\n");
            double nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida ! Digite valores entre 0 e 10 e use ',' para notas decimais");
                i--;
            } else {
                notas[i] = nota;
            }
        }
        scan.close();

        /** Chamando metodos para realizar soma e media */
        System.out.println("* * * Calculando notas... \n");
        CalculadoraMedia calculadoraMedia = new CalculadoraMedia(notas[0], notas[1], notas[2], notas[3]);
        calculadoraMedia.somarNotas();
        calculadoraMedia.calcularMediaFinal();

        /** Retorno de aprovação ou reprovação */
        System.out.println("\n__________________________________________________________");
        System.out.println(" * * * * * MÉDIA FINAL * * * * * ");
        if (calculadoraMedia.getMediaFinal() >= 7) {
            System.out.println("\nParabéns você foi aprovado !");
            System.out.println("\nMédia final: " + calculadoraMedia.getMediaFinal());
        } else if (calculadoraMedia.getMediaFinal() <= 6) {
            System.out.println("\nVocê foi reprovado !");
            System.out.println("Entre em contato com o tutor para realizar o agendamento da recuperação !");
            System.out.println("\nMédia final: " + calculadoraMedia.getMediaFinal());
        }
        System.out.println("__________________________________________________________");
    }
}