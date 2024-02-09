package applicationRevi;

import entitiesRevi.Product;
import entitiesRevi.Salario;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salario salario = new Salario();

        System.out.print("Name: ");
        salario.name = sc.nextLine();


        System.out.print("Gross Salary: ");
        salario.grossSalary = sc.nextDouble();


        System.out.print("Tax: ");
        salario.tax = sc.nextDouble();


        System.out.print("Employee = " + salario.name + ", $" + salario.NetSalary() );
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        System.out.print("Updated data: " + salario.name + ", $" );
        salario.increaseSalary(percentage);


        sc.close();
    }
}
