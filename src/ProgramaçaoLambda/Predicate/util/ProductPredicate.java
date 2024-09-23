package ProgramaçaoLambda.Predicate.util;

import java.util.function.Predicate;

import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;

public class ProductPredicate implements Predicate<Produto>{

    @Override
    public boolean test(Produto p) {
        return p.getPrice() >= 100.0 ;
    }
}
