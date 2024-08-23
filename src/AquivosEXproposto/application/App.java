package AquivosEXproposto.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import AquivosEXproposto.entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Enter a file path: ");
        String srcFilestr = teclado.nextLine();

        File srcFile = new File(srcFilestr);
        String folderSrcString = srcFile.getParent();

        boolean sucess = new File(folderSrcString + "\\out").mkdir();
        System.out.println("Folder created: " + sucess);

        String targetFileStr = folderSrcString + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(srcFilestr))) {
            String itemCSV = br.readLine();
            while (itemCSV != null) {
                String[] fields = itemCSV.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                Produto product = new Produto(name, price, quantity);
                list.add(product);

                itemCSV = br.readLine();
            }
           
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Produto produto: list) {
                    bw.write(produto.getName() + ", " + String.format("%.2f", produto.totalValue()));
                    bw.newLine();
                }
            } catch (Exception e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }


        teclado.close();
    }
}
