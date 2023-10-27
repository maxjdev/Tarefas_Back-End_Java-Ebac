package edu.java.maxjdev;
import edu.java.maxjdev.abstracts.Pessoa;
import edu.java.maxjdev.interfaces.ITermos;
import java.util.Scanner;
/**
 * @author maxdev
 * Classe principal
 */
public class Main implements ITermos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Instancia do Main para usar os metodos de termos de uso
        Main mainInstance = new Main();
        System.out.println("----------> ABERTURA DE CONTA <----------");
//        Termos de uso para abertura da conta
        mainInstance.termosDeContrato();
        String respostaAosTermos = scan.nextLine();
//        Se a resposta for "sim" o metodo retorna true e segue com if, caso nao receber "sim" executado else que encerra o programa
        if (mainInstance.aceitarTermos(respostaAosTermos)) {
//            Seleção de abertura de conta como PF ou PJ atraves do Do-While como loop até que receba uma opção valida para prosseguir
            int r;
            do {
                System.out.println("\n______________________________________________________________________");
                System.out.println("Para abertura de conta como Pessoa Fisica digite 1");
                System.out.println("Para abertura de conta como Pessoa Juridica digite 2");
                System.out.print("R: ");
                r = scan.nextByte();
            } while (r != 1 && r != 2);
//            Input Nome
            System.out.println("Digite seu Nome");
            System.out.print("R: ");
            String nome = scan.next();
//            Input Sobrenome
            System.out.println("Digite seu Sobrenome");
            System.out.print("R: ");
            String sobrenome = scan.next();
//            Input do campo de atributo concreto
            if (r==1) {
//                Input CPF
                System.out.println("Digite seu CPF");
                System.out.print("R: ");
                String cpf = scan.next();
//                Instancia PF
                Pessoa pessoaFisica = new PessoaFisica(nome, sobrenome, cpf);
                System.out.println("\n-----*> Conta criada com sucesso ! <*-----\n");
                System.out.println(pessoaFisica);
            } else {
//                Input CNPJ
                System.out.println("Digite seu CNPJ");
                System.out.print("R: ");
                String cnpj = scan.next();
//                Instancia PJ
                Pessoa pessoaJuridica = new PessoaJuridica(nome, sobrenome, cnpj);
                System.out.println("\n-----*> Conta criada com sucesso !!! <*-----\n");
                System.out.println(pessoaJuridica);
            }
        } else {
//            Output em caso de recusa dos termos de uso
            System.out.println("-----*> Encerrando devido a não aceitação dos termos de uso <*-----");
        }
        scan.close();
    }
}


