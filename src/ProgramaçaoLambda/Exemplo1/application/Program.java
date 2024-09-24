package ProgramaçaoLambda.Exemplo1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import ProgramaçaoLambda.Exemplo1.services.ProductService;
import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.0));
        list.add(new Produto("Mouse", 90.0));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Soma: " + sum);
    }
}
