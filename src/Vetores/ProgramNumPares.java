package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNumPares {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        int numPares = 0;

        for (int i=0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                numPares++;
            }
        }
        System.out.println("NUMEROS PARES: ");

        for (int i=0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + "  ");
            }
        }
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES: %d ",numPares);
    }
}
