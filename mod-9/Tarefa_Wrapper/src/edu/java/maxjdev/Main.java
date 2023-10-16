package edu.java.maxjdev;
import java.util.Scanner;
/**
 * @author maxdev
 */
public class Main {
    public static void main(String[] args) {
//        Instancia && Scanner
        Scanner scan = new Scanner(System.in);
        Wrapper wrapperCast = new Wrapper();
//        Input de vars && chamada de motodos
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println(" * * * * * EXERCICIO DE AUTOBOXING, UNBOXING E CASTING (IMPLICITO E EXPLICITO) * * * * *");
//        Autoboxing
        System.out.println("-----------------------------------------\n");
        System.out.println("Digite um INT para autoboxing: ");
        System.out.print("R: ");
        wrapperCast.setValorInt(scan.nextInt());
        wrapperCast.autoBoxInteger();
        System.out.println("(Primitivo)int: [ " + wrapperCast.getValorInt() + " ] foi convertido para (Wrapper)Integer: [ " + wrapperCast.getValorInteger() + " ]\n");
//        Unboxing
        System.out.println("-----------------------------------------\n");
        System.out.println("Digite um DOUBLE usando ',' para unboxing: ");
        System.out.print("R: ");
        wrapperCast.setValorDouble(scan.nextDouble());
        wrapperCast.unboxingDouble();
        System.out.println("(Wrapper)Double: [ " + wrapperCast.getValorDouble() + " ] foi convertido para (Primitivo)double: [ " + wrapperCast.getValorDoub() + " ]\n");
//        Casting Implicito
        System.out.println("-----------------------------------------\n");
        System.out.println("Digite um SHORT para um CASTING IMPLICITO (INT = SHORT): ");
        System.out.print("R: ");
        wrapperCast.setValorShort(scan.nextShort());
        wrapperCast.castingImplicito();
        System.out.println("Foi realizado o CASTING IMPLICITO de um SHORT [ " + wrapperCast.getValorShort() + " ] para INT [ " + wrapperCast.getValorInt1() + " ]\n" );
//        Casting Explicito
        System.out.println("-----------------------------------------\n");
        System.out.println("Digite um INT para um CASTING EXPLICITO (SHORT = (CAST) INT): ");
        System.out.print("R: ");
        wrapperCast.setValorInt1(scan.nextShort());
        wrapperCast.castingExplicito();
        System.out.println("Foi realizado o CASTING EXPLICITO de um INT [ " + wrapperCast.getValorInt1() + " ] para SHORT [ " + wrapperCast.getValorShort() + " ]\n");
        System.out.println("-----------------------------------------\n");

        scan.close();
    }
}