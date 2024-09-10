package Generics.Delimitados.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Generics.Delimitados.entities.Produto;
import Generics.Delimitados.services.CalculationService;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        List<Produto> list = new ArrayList<>();

        String path = ("C:\\Users\\caiov\\Desktop\\in.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String fields[] = line.split(",");
                list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Produto x = CalculationService.max(list);
            System.out.print("Most expensive: " + x);
        }
         catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

       

    }
}
