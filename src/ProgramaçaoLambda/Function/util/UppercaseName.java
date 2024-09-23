package ProgramaçaoLambda.Function.util;

import java.util.function.Function;
import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;

public class UppercaseName implements Function<Produto,String> {

    @Override
    public String apply(Produto p) {
      return p.getName().toUpperCase();
    }
    
}
