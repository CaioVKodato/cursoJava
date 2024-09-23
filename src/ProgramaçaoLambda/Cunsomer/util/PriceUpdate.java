package ProgramaçaoLambda.Cunsomer.util;

import java.util.function.Consumer;

import ProgramaçaoLambda.ExperienciaComparable.entities.Produto;



public class PriceUpdate implements Consumer<Produto> {

    @Override
    public void accept(Produto p) {
     p.setPrice(p.getPrice()* 1.1);
    }
    
}
