import java.util.Scanner;

public class Main {
    public static void main(String[] args)


    { Scanner input = new Scanner(System.in);
        System.out.println("primo valore ");
        System.out.println("inserisci un numero");
        int a = input.nextInt();

        System.out.println("secondo valore");
        System.out.println("inserisci un numero");
        int b = input.nextInt();

        System.out.println("la somma da lei richiesta è");
        System.out.println(a + b );

        input.close();
    }
}