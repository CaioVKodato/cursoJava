package Arquivos.Introducao.Escrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        
    
    String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

    String path = ("C:\\Users\\caiov\\Desktop\\out.txt");

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
        for (String line: lines) {
            bw.write(line);
            bw.newLine();
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
}
}
