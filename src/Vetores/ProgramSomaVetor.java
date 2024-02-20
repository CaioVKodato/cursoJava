package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomaVetor {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("Valores = ");

        double soma = 0.0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
            soma += vect[i];
        }
        System.out.println();

        double media = soma / vect.length;


        System.out.printf("%nSoma = %.2f", soma);
        System.out.printf("%nMedia = %.2f", media);
    }
}
