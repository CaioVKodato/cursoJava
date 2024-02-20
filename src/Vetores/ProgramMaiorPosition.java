package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaiorPosition {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        double maior = 0.0;
        int posMaior = 0;

        for (int i=0; i < vetor.length; i++) {
            System.out.print("Digite um numero = ");
            vetor[i] = sc.nextDouble();

            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }

        System.out.printf("Maior valor = %.1f %n",maior);
        System.out.printf("Posição de maior valor = %d ",posMaior);

        sc.close();
    }
}
