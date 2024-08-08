package EnumExercises.Ex1.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import EnumExercises.Ex1.entitesEnum.WorkerLevel;
import EnumExercises.Ex1.entities.HourContract;
import EnumExercises.Ex1.entities.Worker;

public class App {

    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);

        System.out.print("Enter department's name: ");
        String departmentName = teclado.nextLine();
        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = teclado.nextLine();

        System.out.print("Level: ");
        String workerLevel = teclado.nextLine();

        System.out.print("Base salary: ");
        double workerBaseSalary = Double.parseDouble(teclado.nextLine());

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new EnumExercises.Ex1.entities.Department(departmentName));


        System.out.print("How many contracts to this worker? ");
        int nContracts = teclado.nextInt();
        teclado.nextLine(); // consume the remaining newline

        for (int i = 0; i < nContracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data");
            System.out.print("DATE (DD/mm/YYYY): ");
            Date contractDate = sdf.parse(teclado.next());
            System.out.print("Value per hour: ");
            double valuePhour = teclado.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = teclado.nextInt();

            HourContract contract = new HourContract(contractDate, valuePhour, duration);
            worker.addContracts(contract);

        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthANDyear = teclado.next();
        int month = Integer.parseInt(monthANDyear.substring(0, 1));
        int year = Integer.parseInt(monthANDyear.substring(3, 6));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthANDyear + ": " + String.format("%.2f", worker.income(year, month)));


        teclado.close();
    }
}
