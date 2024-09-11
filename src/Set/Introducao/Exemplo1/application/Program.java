package Set.Introducao.Exemplo1.application;

import java.util.LinkedHashSet;
import java.util.Set;


public class Program {
    public static void main(String[] args) {
        // Set<String> set = new HashSet<>(); //HashSet não garante a ordem dos elementos, porém é o mais rapido de executar.
        //Set<String> set = new TreeSet<>(); //TreeSet ordena os dados por String. 
        Set<String> set = new LinkedHashSet<>(); //Mantem as ordens que os elementos são inseridos.
        
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set.removeIf(x -> x.length() >= 3);

        for (String p : set) {
            System.out.println(p);
        }
    }
}
