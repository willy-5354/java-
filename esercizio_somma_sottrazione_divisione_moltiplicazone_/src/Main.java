import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("esegui somma");

        System.out.println("inserisci il primo valore");
        int somma1 = input.nextInt();
        System.out.println("inserisci un secondo valore ");
        int somma2 = input.nextInt();
        int somma = somma1 + somma2;

        System.out.println("la somma da lei richiesta è:" + somma);




        System.out.println("esegui differenza");

        System.out.println("inserisci il primo valore");
        int differenza1 = input.nextInt();
        System.out.println("inserisci un secondo valore");
        int differenza2 = input.nextInt();
        int sottrazione = differenza1 - differenza2;

        System.out.println("la differenza da lei richiesta è la seguente:" +sottrazione);




        System.out.println("prodotto");

        System.out.println("inserisci il pirmo valore");
        int prodotto1 = input.nextInt();
        System.out.println("inserisci un secondo valore");
        int prodotto2 = input.nextInt();
        int prodotto = prodotto1 * prodotto2;

        System.out.println("il prodotto da lei richiesto è:" + prodotto);






        System.out.println("dividendo ");

        System.out.println("inserisci primo valore ");
        int dividendo1 = input.nextInt();
        System.out.println("inserisci un secondo valore");
        int dividendo2 = input.nextInt();
        int dividendo = dividendo1 / dividendo2;

        System.out.println("la divisione da lei richiesta è:" +dividendo);


        input.close();
    }
}