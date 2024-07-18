package Const.Encapsulamento.entities;

public class Conta {
    
    private String name;

    private int numConta;

    private double saldo;

    private static final double TAXA_SALDO = 5.0;


    public Conta() {
    }


    public Conta(String name, int numConta, double initialDeposit) {
        this.name = name;
        this.numConta = numConta;
        this.saldo += initialDeposit;
    }

    public double Depositar (double valor) {
       this.saldo += valor;
       return saldo;
    }

    public double Sacar(double valor) {
        this.saldo -= (valor + TAXA_SALDO);
        return saldo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String toString() {
        return "Account " + numConta + ", Holder: " + name + ", Balance: $" + String.format("%.2f", saldo);
    }


}
