package introdução;

import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,i, soma=0;
        int numero;

        N = sc.nextInt();

        for (i=0; i<N; i++) {
            numero = sc.nextInt();
            soma += numero;
        }

        System.out.println(soma);


        sc.close();
    }
}
