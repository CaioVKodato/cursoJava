package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAbaixoMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos tem o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        double soma = 0.0;

        for (int i=0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double mediaVetor = soma / (double) n;

        System.out.printf("MEDIA DO VETOR = %.3f",mediaVetor);
        System.out.println();

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i=0; i < n; i++) {
            if (vetor[i] < mediaVetor) {
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
