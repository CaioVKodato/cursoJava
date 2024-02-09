package introdução;

import java.util.Scanner;

public class matematica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B= Math.sqrt(y);
        C= Math.sqrt(25.0);

        System.out.println("A raiz quadrade de " + x + " = " + A);
        System.out.println("A raiz quadrade de " + y + " = " + B);
        System.out.println("A raiz quadrada de 25 = " + C);

        A = Math.pow(x,y);
        B = Math.pow(x,2.0);
        C = Math.pow(5.0,2.0);

        System.out.println();

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado a 2.0 = " + B);
        System.out.println("5.0 elevado a 2.0 = " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println();

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);






        sc.close();
    }
}

