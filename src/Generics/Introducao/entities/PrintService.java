package Generics.Introducao.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {
    
    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        return list.get(0);
    } 

    public void print () {
        System.out.print("[");
        
        for (T l: list) {
            System.out.print(l);
            System.out.print(", ");
        }
        System.out.print("]");

    }
}
