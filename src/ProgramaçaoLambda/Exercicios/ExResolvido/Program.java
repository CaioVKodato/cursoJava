package ProgramaçaoLambda.Exercicios.ExResolvido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = teclado.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Produto> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String fields[] = line.split(",");
                list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double media = list.stream()
                            .map(p -> p.getPrice())
                            .reduce(0.0, (x,y) -> x + y) / list.size();
            
            System.out.println("Media: " + String.format("%.2f", media));

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                                .filter(p -> p.getPrice() < media)
                                .map(p -> p.getName())
                                .sorted(comp.reversed())
                                .collect(Collectors.toList());

            names.forEach(System.out:: println);
                            }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        teclado.close();
    }
}
