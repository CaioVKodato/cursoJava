package Vetores;

import entitiesDesafioPensionato.Hotel;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDesafioPensionato {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hotel[] vetor = new Hotel[10];

        System.out.print("How many rooms will be rented: ");
        int quartosAlugados = sc.nextInt();

        for (int i=1; i <= quartosAlugados; i++) {
            System.out.printf("Rent #%d: %n",i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vetor[roomNumber] = new Hotel(name,email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        System.out.println();

        for (int i=0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(i+ ": " + vetor[i]);
            }
        }






        sc.close();
    }
}
