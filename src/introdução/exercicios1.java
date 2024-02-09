import java.util.Scanner;

public class exercicios1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        int num1,num2,soma;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("A soma de " + num1 + "+" + num2 + " = " + soma);

        System.out.println();

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("A soma de " + num1 + "+" + num2 + " = " + soma);

        System.out.println();

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("A soma de " + num1 + "+" + num2 + " = " + soma);

        sc.close();
    }
}
