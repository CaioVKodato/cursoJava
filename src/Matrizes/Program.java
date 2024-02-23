package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int numNeg = 0;

        for (int i=0; i < n; i++) {
            for (int j=0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0) {
                    numNeg++;
                }
            }
        }

        System.out.println("Main diagonal: ");

        for (int i=0; i < n; i++) {
            for (int j=0; j < n; j++) {
                if ( i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Negative numbers: " + numNeg);

    }
}
