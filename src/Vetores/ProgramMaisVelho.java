package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaisVelho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] idade = new int[n];

        int idadeMaior = 0;

        for (int i=0; i < n; i++) {
            System.out.printf("Dados da %da pessoas",i+1);
            System.out.println();
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            if (idade[i] > idadeMaior) {
                idadeMaior = idade[i];
            }
        }

        for (int i=0; i < n; i++) {
            if (idade[i] == idadeMaior) {
                System.out.println();
                System.out.println(name[i]);
            }
        }


        sc.close();
    }
}
