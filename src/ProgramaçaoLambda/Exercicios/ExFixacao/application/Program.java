package ProgramaçaoLambda.Exercicios.ExFixacao.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import ProgramaçaoLambda.Exercicios.ExFixacao.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter a full path: ");
        String path = teclado.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String fields[] = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();

                Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());


                System.out.print("Qual salario voce quer comparar? ");
                double salary = teclado.nextDouble();

                List<String> emails = list.stream()
                                      .filter(p -> p.getSalario() > salary)
                                      .map(p -> p.getEmail())
                                      .sorted(comp)
                                      .collect(Collectors.toList());
                System.out.println("Aqui estão as pessoas com salário superior ao que você desejou: ");
                emails.forEach(System.out:: println);

                double sum = list.stream()
                            .filter(x -> x.getName().charAt(0)== 'M')   
                            .map(x-> x.getSalario())
                            .reduce(0.0, (x,y) -> x + y);
                
                System.out.println("Soma dos salários das pessoas que iniciam com a letra M: " + 
                String.format("%.2f", sum));
                

            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        teclado.close();
    }
}
