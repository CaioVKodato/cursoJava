package introdução;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        double raio,area;

        raio = sc.nextDouble();

        area = Math.pow(raio,2) * 3.14159;

        System.out.printf("O valor da área correspondente ao raio valendo %.2f = %.4f",raio,area);

        sc.close();
    }
}
