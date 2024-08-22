package Arquivos.Introducao.ManipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter a folder path:");
        String strPath = teclado.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println();
        System.out.println("FOLDERS:");
        System.out.println(folders);

        for (File folder: folders) {
            System.out.println(folder);
        }

        File [] files = path.listFiles(File:: isFile);
        System.out.println();
        System.out.println("FILES: ");
        System.out.println(files);

        for (File file: files) {
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\Galoliberta").mkdir();
        System.out.println("Diretorio criado com sucesso: " + sucess);



        teclado.close();
    }
}
