import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.print("Enter your name: \n");
        String name = input.nextLine();
        input.close();

        System.out.println("-------------------------------");
        System.out.println("Hello world, " + name.concat(" ! This is Java ! ! ! "));
        System.out.println("-------------------------------");
    }
}