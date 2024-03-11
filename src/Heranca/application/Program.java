package Heranca.application;

import Heranca.entities.Account;
import Heranca.entities.BusinessAccount;
import Heranca.entities.SavingsAccount;


public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(1001,"Alex",1000.0);
        acc1.Withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002,"Maria",1000.00,0.01);
        acc2.Withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3= new BusinessAccount(1003,"Caio",1000.00,500.00);
        acc3.Withdraw(200.00);
        System.out.println(acc3.getBalance());
    }
}
