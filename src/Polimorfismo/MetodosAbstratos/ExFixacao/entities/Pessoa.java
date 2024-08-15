package Polimorfismo.MetodosAbstratos.ExFixacao.entities;

public abstract class Pessoa {
    
    protected String name;
    protected Double rendaAnual;


    public Pessoa() {
    }


    public Pessoa(String name, double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRendaAnual() {
        return this.rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract double calcRenda();

}
