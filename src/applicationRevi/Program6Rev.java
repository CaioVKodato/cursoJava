package applicationRevi;

import entitiesRevi.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Program6Rev {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Banco banco;

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Enter the account number: ");
        int number = sc.nextInt();
        
        System.out.println("Is the a initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'y') {
            System.out.println("Enter the initial value: ");
            double initialDeposit = sc.nextDouble();
            banco = new Banco(name,number,initialDeposit);
        }
        else {
            double initialDeposit = 0;
            banco = new Banco(name,number);
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(banco);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        banco.deposito(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(banco);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        banco.saque(withdrawValue);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(banco);








        sc.close();
    }
}

