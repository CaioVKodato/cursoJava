package applicationRevi;


import entitiesRevi.Nota;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Nota nota = new Nota();

        nota.name = sc.nextLine();
        nota.nota1 = sc.nextDouble();
        nota.nota2 = sc.nextDouble();
        nota.nota3 = sc.nextDouble();

        System.out.print("FINAL GRADE: " + nota.FinalGrade());
        if (nota.FinalGrade() > 60) {
            System.out.println();
            System.out.println("PASS");
        }
        else {
            System.out.println();
            System.out.println("FAILED");
            System.out.print("MISSING " + nota.MissingPoints() + " POINTS");
        }





        sc.close();
    }

}