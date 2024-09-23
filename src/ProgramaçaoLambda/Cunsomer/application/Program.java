package ProgramaçaoLambda.Cunsomer.application;

import java.util.ArrayList;
import java.util.List;

import ProgramaçaoLambda.Cunsomer.util.PriceUpdate;
import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;

public class Program {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.0));
        list.add(new Produto("Mouse", 90.0));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD case", 80.90));

        list.forEach(new PriceUpdate());

        list.forEach(System.out :: println);
    }
}
