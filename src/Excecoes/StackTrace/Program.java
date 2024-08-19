package Excecoes.StackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("**METHOD 1 START**");
        method2();
        System.out.println("**METHOD 1 END**");
    }

    public static void method2() {
        System.out.println("**METHOD 2 START**");
        Scanner teclado = new Scanner(System.in);

        try { 
        String[] vect = teclado.nextLine().split(" ");
        int position = teclado.nextInt();
        System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
            teclado.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("**METHOD 2 END**");
        

        teclado.close();

    }
        
    }

