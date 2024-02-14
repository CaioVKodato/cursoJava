package entitiesRevi;

public class Banco {

    private String name;
    private int number;
    private double valor;

    public Banco (String name, int number, double initialDeposit) {
        this.name = name;
        this.number = number;
        deposito(initialDeposit);
    }

    public Banco (String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getValor() {
        return valor;
    }

    public void deposito (double amount) {
        valor += amount;
    }

    public void saque (double amount) {
        valor -= (amount + 5.00);
    }

    public String toString() {
        return ("Account " + number + ", Holder: " + name + ", Balance: $" + valor);
    }
}
