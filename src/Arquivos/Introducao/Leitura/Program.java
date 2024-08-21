package Arquivos.Introducao.Leitura;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\caiov\\Desktop\\PC.txt");

        Scanner teclado = null;

        try {
            teclado = new Scanner(file);
            while (teclado.hasNextLine()) {
                System.out.println(teclado.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (teclado != null) { 
            teclado.close();
            }
        }
    }
}
