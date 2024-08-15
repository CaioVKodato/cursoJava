package Polimorfismo.MetodosAbstratos.ExFixacao.entities;

public class PessoaJuridica extends Pessoa {

    private Integer numFuncionarios;

    private double valorImposto;


    public PessoaJuridica() {
        super();
    }


    public PessoaJuridica(String name, Double rendaAnual, Integer numFuncionarios) {
        super(name ,rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }


    public Integer getNumFuncionarios() {
        return this.numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public void verifFunc() {
        if (numFuncionarios > 10) {
            valorImposto = 0.14;
        }
        else {
            valorImposto = 0.16;
        }
    }

    public double calcRenda() {
        verifFunc();
        return rendaAnual * valorImposto;
    }

 


}
