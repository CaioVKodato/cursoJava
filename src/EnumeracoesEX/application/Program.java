package EnumeracoesEX.application;

import EnumeracoesEX.entities.Department;
import EnumeracoesEX.entities.HourContract;
import EnumeracoesEX.entities.Worker;
import EnumeracoesEX.entitiesEnum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter work data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double workerBaseSalary = Double.parseDouble(sc.nextLine());
        System.out.println();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),workerBaseSalary,new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println();

        for (int i=1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHora = Double.parseDouble(sc.next());
            System.out.print("Duration (hours) : ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valuePerHora,hours);

            worker.addContracts(contract);
            System.out.println();
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/yyyy): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f",worker.income(year,month)));

        sc.close();
    }
}
