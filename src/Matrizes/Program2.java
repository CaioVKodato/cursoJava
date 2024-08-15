package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Qual valor deseja procurar? ");
        int valorEncontrar = sc.nextInt();

        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < m; j++) {

                if (matriz[i][j] == valorEncontrar) {
                    System.out.println("Position: " + i + "," + j);
                    if ( j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if  (j < matriz[i].length -1 ) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
