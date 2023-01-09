import java.util.Scanner;

public class Main {

    public static void main(String[] args)

    {   Scanner input = new Scanner(System.in);
        System.out.println("Rettangolo");
        System.out.println("inserisci base");
        int base = input.nextInt();
        System.out.println("inserisci altezza");
        int altezza = input.nextInt();

        int area = base * altezza;
        System.out.println("area è: " +area);



        int perimetro = (base*2 + altezza*2);
        System.out.println("perimetro è:" +perimetro);



        System.out.println("triangolo");
        System.out.println("inserisci base");
        base = input.nextInt();
        System.out.println("inserisci altezza");
        altezza = input.nextInt();



        int aretriangolo = base * altezza /2;
        System.out.println("areatriangolo è: " +aretriangolo);

        int perimetrotriangolo = base * 3;
        System.out.println("perimetrotriangolo è: " +perimetrotriangolo);



        System.out.println("cerchio");
        System.out.println("inserisci raggio");
        double raggio = input.nextDouble();

        double perimetrocerchio= 2 * raggio *3.14;
        System.out.println("perimetrocerchio è" +perimetrocerchio);
        double areacerchio = raggio * raggio * 3.14;
        System.out.println("areacerchio è:" +areacerchio);





        System.out.println("quadrato");
        System.out.println("inserisci lato");
        int latoquadrato = input.nextInt();

        int perimetroquadrato = latoquadrato * 4;
        System.out.println("perimetroquadrato è" +perimetroquadrato);

        int areaquadrato = latoquadrato * latoquadrato;
        System.out.println("area del quadrato è:" +areaquadrato);


        input.close();


    }
}