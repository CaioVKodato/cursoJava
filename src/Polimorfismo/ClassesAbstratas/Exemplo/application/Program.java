package Polimorfismo.ClassesAbstratas.Exemplo.application;

import java.util.ArrayList;
import java.util.List;

import Polimorfismo.ClassesAbstratas.Exemplo.entities.Account;
import Polimorfismo.ClassesAbstratas.Exemplo.entities.BusinessAccount;
import Polimorfismo.ClassesAbstratas.Exemplo.entities.SavingsAccount;

public class Program {

   public static void main(String[] args) {
    
    List<Account> list = new ArrayList<>();

    list.add(new SavingsAccount(1001, "Caio Kodato", 500.00, 0.01));
    list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
    list.add(new SavingsAccount(1003, "Bob", 400.0, 0.01));
    list.add(new BusinessAccount(1004, "Luana", 500.00, 500.00));

    double sum = 0.0;

    for (Account conta: list) {
        sum += conta.getBalance();
    }

    System.out.println("Total balance: " + String.format("%.2f", sum));

    for (Account conta: list) {
        conta.Deposit(10.0);
        System.out.println(conta.getBalance());
    }

   }

}
