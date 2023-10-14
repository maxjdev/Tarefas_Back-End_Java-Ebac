package edu.java.maxjdev;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fulano", 1.75f, (byte) 25);

        System.out.println("\n-----------------------------------------");
        System.out.println("Chamando Getters & Setters");
        System.out.println("Retorno: \n");
        System.out.println(
                pessoa1.getNome() + " tem " + pessoa1.getIdade() +
                " anos de idade e " + pessoa1.getAltura() + " de altura"
        );
        System.out.println("-----------------------------------------");
        System.out.println("Chamando método andar()");
        System.out.println("Retorno: \n");
        pessoa1.andar();
        System.out.println("-----------------------------------------");
        System.out.println("Chamando método comer() passando Pão como parametro & nome=Fulano;");
        System.out.println("Retorno: \n");
        pessoa1.comer("Pão");
        System.out.println("-----------------------------------------");

    }
}
