package Map.Introducao.application;

import java.util.HashMap;
import java.util.Map;

import Map.Introducao.entities.ProdutoMap;

public class Program2 {
    public static void main(String[] args) {
        Map<ProdutoMap, Double> stock = new HashMap<>();

        ProdutoMap p1 = new ProdutoMap("Tv", 900.00);
        ProdutoMap p2 = new ProdutoMap("Notebook", 1200.00);
        ProdutoMap p3 = new ProdutoMap("Tablet", 400.00);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        ProdutoMap ps = new ProdutoMap("Tv", 900.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps)) ;
    }
}
