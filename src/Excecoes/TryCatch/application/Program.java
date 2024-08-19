package Excecoes.TryCatch.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        try { 
        String[] vect = teclado.nextLine().split(" ");
        int position = teclado.nextInt();
        System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        
        System.out.println("End of program.");

        teclado.close();
    }
}
