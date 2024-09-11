package Set.ComparacaoSet.application;

import java.util.HashSet;
import java.util.Set;

import Set.ComparacaoSet.entities.ProdutoSet;

public class Program {
    public static void main(String[] args) {
        Set<ProdutoSet> set = new HashSet<>();

        set.add(new ProdutoSet("TV", 900.00));
        set.add(new ProdutoSet("Notebook", 1200.00));
        set.add(new ProdutoSet("Tablet", 400.00));

        ProdutoSet prod = new ProdutoSet("Notebook", 1200.00);
        System.out.println(set.contains(prod));
    }
}
