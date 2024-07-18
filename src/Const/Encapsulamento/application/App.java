package Const.Encapsulamento.application;

import java.util.Locale;
import java.util.Scanner;

import Const.Encapsulamento.entities.Conta;

public class App {
    
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Enter account number: ");
        int numberAcc = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holderAcc = sc.nextLine();
        
        System.out.println("Is there a initial deposit ? y/n");
        char haveInitialDeposit = sc.next().charAt(0);
        

        if (haveInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double valorInitialDeposit = sc.nextDouble();
            conta = new Conta(holderAcc, numberAcc, valorInitialDeposit);
        }

        else {
            conta = new Conta(holderAcc, numberAcc, 0.0);
        
        }
            System.out.println("Account data: ");
            System.out.println(conta);

            System.out.println();

            System.out.print("Enter a deposit value : ");
            double depositValue = sc.nextDouble();
            conta.Depositar(depositValue);
            System.out.println("Updated account data: ");
            System.out.println(conta);

            System.out.println();

            System.out.print("Enter a withdraw value : ");
            double withdrawValue = sc.nextDouble();
            conta.Sacar(withdrawValue);
            System.out.println("Updated account data: ");
            System.out.println(conta);



        sc.close();

    }
}
