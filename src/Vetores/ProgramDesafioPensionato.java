package Vetores;

import entitiesDesafioPensionato.Hotel;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDesafioPensionato {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hotel[] vetor = new Hotel[10];

        System.out.println("How many rooms will be rented");
        int quartosAlugados = sc.nextInt();

        for (int i=1; i <= quartosAlugados; i++) {
            System.out.printf("Rent #%d: ",i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            Hotel hotel = new Hotel(name,email);
        }






        sc.close();
    }
}
