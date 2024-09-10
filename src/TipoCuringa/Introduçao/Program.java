package TipoCuringa.Introduçao;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(3,10,14);
        System.out.println(myInts);

        List<String> myStr = Arrays.asList("Maria", "Bob", "Caio");
        System.out.println(myStr);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

//Não é possível adicionar dados na lista de um tipo Curinga. Por exemplo: Não é possível a notação "list.add(3);"
