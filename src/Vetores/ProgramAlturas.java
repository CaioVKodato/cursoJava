package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAlturas {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i < n; i++) {
            System.out.printf("Dados da %da pessoa",i+1);
            System.out.printf("%nNome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAltura = 0;
        int nMenores = 0;
        for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                nMenores++;
            }
            somaAltura += alturas[i];
        }

        double mediaAltura = somaAltura / n;
        double porcent = nMenores / (double )n * 100;
        System.out.printf("Altura média: %.2f %n",mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f por cento",porcent);
        System.out.println();

        for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                System.out.print(nomes[i] +"  " );
            }
        }
    }
}
