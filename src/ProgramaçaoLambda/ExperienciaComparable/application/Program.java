package ProgramaçaoLambda.ExperienciaComparable.application;

import java.util.ArrayList;
import java.util.List;

import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;

public class Program {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 1200.0));
        list.add(new Produto("Notebook", 450.0));
        list.add(new Produto("Tablet", 900.0));

       // list.sort(new MyComparator()); Forma 1 de utilizar método sort.
       
    
       //Forma de utilizar com expressão lambda
       list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Produto p: list) {
            System.out.println("P.name: " + p.getName() + "      P.price: " + String.format("%.2f", p.getPrice()));
        }
    }
}
