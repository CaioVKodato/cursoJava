package entitiesRevi;

public class Salario {

    public String name;

    public double grossSalary;

    public double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double valor = grossSalary * (percentage / 100);
        valor = NetSalary() + valor;
        System.out.println(valor);
    }

}
