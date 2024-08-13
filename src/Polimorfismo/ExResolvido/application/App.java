package Polimorfismo.ExResolvido.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.ExResolvido.entities.Employee;
import Polimorfismo.ExResolvido.entities.OutsourceEmployee;

public class App {  

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> listEmp = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1));
            System.out.print("Outsource(y/n)?  ");
            char verifEmp = teclado.next().charAt(0);

            if (verifEmp == 'n') {
                System.out.print("Name: ");
                teclado.nextLine();
                String name = teclado.nextLine();
                System.out.print("Hours: ");
                int hours = teclado.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = teclado.nextDouble();

                Employee emp = new Employee(name, hours, valuePerHour);
                listEmp.add(emp);
            }
            else if (verifEmp == 'y') {
                System.out.print("Name: ");
                teclado.nextLine();
                String name = teclado.nextLine();
                System.out.print("Hours: ");
                int hours = teclado.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = teclado.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = teclado.nextDouble();

                Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                listEmp.add(emp);
            }
            else {
                System.out.println("Caractere invalido");
            }

        }

        System.out.println("PAYAMENTS: ");
            for (Employee emps: listEmp) {
                System.out.println(emps.getName() + "- $" + emps.payament());
            }
        teclado.close();
    }

}
