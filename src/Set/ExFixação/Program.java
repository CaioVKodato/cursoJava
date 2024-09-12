package Set.ExFixação;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
   public static void main(String[] args) throws ParseException {
    Scanner teclado = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    Set<Integer> a = new HashSet<>();
    Set<Integer> b = new HashSet<>();
    Set<Integer> c = new HashSet<>();

    System.out.print("How many students for course A? ");
    int n = teclado.nextInt();

    for (int i=0; i < n; i ++) {
      int aluno = teclado.nextInt();
      a.add(aluno);
    }

    System.out.print("How many students for course B? ");
    n = teclado.nextInt();
    
    for (int i=0; i < n; i ++) {
      int aluno = teclado.nextInt();
      b.add(aluno);
    }

    System.out.print("How many students for course C? ");
    n = teclado.nextInt();
    
    for (int i=0; i < n; i ++) {
      int aluno = teclado.nextInt();
      c.add(aluno);
    }

    Set<Integer> total = new HashSet<>(a);
    total.addAll(c);
    total.addAll(b);

    System.out.println("Total alunos = " + total.size());

    teclado.close();
   }
}
