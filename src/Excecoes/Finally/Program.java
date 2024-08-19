package Excecoes.Finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {  
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");

        Scanner teclado = null;

        try {
            teclado = new Scanner(file);
            while(teclado.hasNextLine()) {
                System.out.println(teclado.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (teclado != null) {
                teclado.close();
                System.out.println("Bloco finally realizado ");
            }
        }
    }
    
}
