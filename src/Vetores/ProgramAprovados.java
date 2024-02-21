package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados ? ");
        int n = sc.nextInt();

        String[] name= new String[n];
        double[] nota1= new double[n];
        double[] nota2= new double[n];



        for (int i=0; i < n; i++) {
            System.out.printf("Digite nome, nota1 e nota2 do %d aluno: %n",i+1);
            sc.nextLine();
            name[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i=0; i < n; i++) {
            if ((nota1[i]+nota2[i]) /2 >= 6) {
                System.out.println(name[i]);
            }
        }



        sc.close();
    }
}
