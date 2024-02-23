package applicationDesafioLista;

import entitiesDesafioLista.Employees;

import java.util.*;


public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employees> list = new ArrayList<>();

        for (int i=0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + ":" );
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

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();

        Integer pos = positionId(list, idSalary);

        if (pos == null) {
            System.out.println("This id does not exist! ");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");

        for (Employees emp : list) {
            System.out.println(emp);
        }

        sc.close();
  }

  public static Integer positionId(List<Employees> list, int id) {
        for (int i=0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
  }


}
