package Excecoes.ExFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import Excecoes.ExFixacao.models.entities.Account;
import Excecoes.ExFixacao.models.exception.DomainException;

public class Program {
    public static void main(String[] args) {
       

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int numberAcc = teclado.nextInt();
        System.out.print("Holder: ");
        teclado.nextLine();
        String holder = teclado.nextLine();
        System.out.print("Initial balance: ");
        double initBalance = teclado.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = teclado.nextDouble();

        Account conta = new Account(numberAcc, holder, initBalance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double amount = teclado.nextDouble();
        System.out.println();
        
        try { 
        conta.withdraw(amount);
        System.out.println("New balance = " + String.format("%.2f", conta.getBalance()));
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        
        teclado.close();
    }
}
