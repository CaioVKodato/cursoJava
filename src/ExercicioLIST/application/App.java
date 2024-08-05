package ExercicioLIST.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ExercicioLIST.entities.Employee;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = teclado.nextInt();

        List<Employee> listFuncionarios = new ArrayList<>();

        for (int i=1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i);
            System.out.print("Id: ");
            Integer id = teclado.nextInt();
            System.out.print("Name:");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.print("Salary: ");
            Double salary = teclado.nextDouble();

            Employee emp = new Employee(id,name,salary);
            listFuncionarios.add(emp);
        }

        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = teclado.nextInt();
        Integer pos = position(listFuncionarios, idSalary);
        if (pos != null) { 
        System.out.print("Enter the percentage: ");
        double percentage = teclado.nextDouble();
        listFuncionarios.get(pos).increaseSalary(percentage);
        }
        else {
            System.out.println("This id does not exist");
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee emp : listFuncionarios) {
            System.out.println(emp);
        }
        


        teclado.close();
    }

    public static Integer position(List<Employee> list, int id) {
            for (int i=0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    return i;
                } 

            }
            return null;
    }
}
