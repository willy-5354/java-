import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("giorni");
        int giorni= input.nextInt();
        System.out.println("ore");
        int ore = input.nextInt();
        System.out.println("minuti");
        int minuti = input.nextInt();
        System.out.println("secondi");
        int secondi= input.nextInt();

        System.out.println(giorni * 86400 + ore * 3600 + minuti * 60 + secondi);
        input.close();

    }
}