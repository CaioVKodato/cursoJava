package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMediaPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        int numPares = 0;
        double somaPares = 0.0;

        for (int i=0; i < vetor.length; i++) {
            System.out.print("Digite o numero: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                numPares++;
                somaPares += vetor[i];
            }
        }

        if (numPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            double mediaPares = somaPares / (double) numPares;
            System.out.printf("MEDIA DOS PARES= %.1f",mediaPares);
        }


        sc.close();
    }
}
