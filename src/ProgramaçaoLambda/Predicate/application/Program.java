package ProgramaçaoLambda.Predicate.application;

import java.util.ArrayList;
import java.util.List;

import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;
import ProgramaçaoLambda.Predicate.util.ProductPredicate;

public class Program {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.0));
        list.add(new Produto("Mouse", 90.0));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD case", 80.90));

        list.removeIf(new ProductPredicate());

        for (Produto p: list) {
            System.out.println("Product name: " + p.getName() + "   Product price: " + String.format("%.2f", p.getPrice()));
        }
    }
}
