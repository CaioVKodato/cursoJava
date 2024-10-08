package Interfaces.InterfaceComparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Interfaces.InterfaceComparable.entities.Employee;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = ("C:\\Users\\caiov\\Desktop\\in.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String fields[] = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                 employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + String.format(" %.2f",emp.getSalary()));
            }

        }
        catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
