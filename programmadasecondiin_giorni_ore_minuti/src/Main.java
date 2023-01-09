import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //fa si che tu puoi mettere un input, cioè inserire, nel programma che lancio, i valori che voglio

        System.out.println("inserisci il tempo in secondi");
        int seconditotali = input.nextInt();
        int giorni = seconditotali / 86400;
        int giorni_resto = seconditotali % 86400;
        int ore = seconditotali / 3600;
        int ore_resto= seconditotali % 3600;
        int minuti = seconditotali / 60;
        int minuti_resto = seconditotali % 60;
        int secondi_resto= seconditotali % 60;

        System.out.println("i giorni da lei richiesti sono:" +giorni);
        System.out.println("le ore da lei richiesti sono:" +ore);
        System.out.println("i minuti da lei richiesti sono:" +minuti);
        System.out.println("i secondi_tot da lei richiesti sono:" +seconditotali);
        System.out.println("i secondi da lei richiesti sono" +secondi_resto);
        input.close();
    }
}