package Set.ComparacaoTreeSet.application;

import java.util.Set;
import java.util.TreeSet;

import Set.ComparacaoSet.entities.ProdutoSet;

//Quando utilizarmos o TreeSet, sua classe do conjunto deve implementar a interface Comparable. Assim, o TreeSet consegue ordenar os objetos.

public class Program {
    public static void main(String[] args) {
        Set<ProdutoSet> set = new TreeSet<>();

        set.add(new ProdutoSet("TV", 900.00));
        set.add(new ProdutoSet("Notebook", 1200.00));
        set.add(new ProdutoSet("Tablet", 400.00));

        for (ProdutoSet p: set) {
            System.out.println(p);
        }
    }
}
