package EnumeracoesEX.application;

import EnumeracoesEX.entities.Department;
import EnumeracoesEX.entities.Worker;
import EnumeracoesEX.entitiesEnum.WorkerLevel;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter department's name: ");
        String departmentName = teclado.nextLine();

        System.out.println("Enter work data: ");

        System.out.print("Name: ");
        String workerName = teclado.nextLine();

        System.out.print("Level: ");
        String workerLevel = teclado.nextLine();

        System.out.print("Base salary: ");
        double workerBaseSalary = teclado.nextDouble();
        System.out.println();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),workerBaseSalary,new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = teclado.nextInt();

        teclado.close();
    }
}
