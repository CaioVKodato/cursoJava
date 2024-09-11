package TipoCuringa.Problema2Delimitados.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

//Vamos fazer um método que copia os elementos de uma lista para outra lista que pode ser mais genérica que a primeira


/*          COVARIÂNCIA
    List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0); // GET = OK

        list.add(20); // PUT = ERROR */

        
/*          CONTRAVARIÂNCIA
    List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Bob");

        List<? super Number> myNums = myObjs;

        myNums.add(10); PUT = OK
        myNums.add(3.14); PUT = OK

        Number x = myNums.get(0); GET = ERROR */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>(); 

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);


    }

    public static void copy (List<? extends Number> source, List<? super Number> destiny) {
        for (Number number: source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj: list) {
            System.out.print(obj + " ");
        }
    }
}
