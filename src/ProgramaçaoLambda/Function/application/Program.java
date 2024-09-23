package ProgramaçaoLambda.Function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;
import ProgramaçaoLambda.Function.util.UppercaseName;

public class Program {
    public static void main(String[] args) {
        
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.0));
        list.add(new Produto("Mouse", 90.0));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD case", 80.90));

        List<String> names = list.stream().map(new UppercaseName()).collect(Collectors.toList());

        names.forEach(System.out:: println);
        

    }
}
