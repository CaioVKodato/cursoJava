package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDadosPessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        int numHomens = 0;
        double somaAlturaFem = 0.0;
        int numMulher = 0;
        double menorAltura = 2.0;
        double maiorAltura = 0.0;

        for (int i=0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ",i+1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            genero[i] = sc.next().charAt(0);

            if (genero[i] == 'F') {
                numMulher++;
                somaAlturaFem += altura[i];
            }
            else if (genero[i] == 'M'){
                numHomens++;
            }

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            else if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        double mediaAlturaF = somaAlturaFem / (double) numMulher;
        System.out.println();
        System.out.printf("Menor altura = %.2f %n",menorAltura );
        System.out.printf("Maior altura = %.2f %n",maiorAltura);
        System.out.printf("Média de altura feminina = %.2f %n",mediaAlturaF);
        System.out.printf("Numero de homens = %d",numHomens);



        sc.close();
    }
}
