package ProgramaçaoLambda.Exemplo1.services;

import java.util.List;
import java.util.function.Predicate;

import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;

public class ProductService {
    public double filteredSum(List<Produto> list, Predicate<Produto> criteria) {
        double sum = 0.0;

        for (Produto p: list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
