package applicationDesafioLista;

import entitiesDesafioLista.Employees;

import java.util.*;


public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employees> list = new ArrayList<>();

        for (int i=0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + i+1 + ":" );
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salario = sc.nextDouble();

            Employees emp = new Employees(id, name, salario);
            list.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();





        sc.close();
  }


}
