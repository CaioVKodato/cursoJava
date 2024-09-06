package Generics.Introducao.application;

import java.util.Scanner;

import Generics.Introducao.entities.PrintService;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        for (int i=0; i < n; i++) {
            Integer value = teclado.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println();
        Integer x = ps.first();
        System.out.print("First: " + x);

        teclado.close();
    }
}
