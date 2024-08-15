package Polimorfismo.MetodosAbstratos.ExFixacao.entities;

public class PessoaFisica extends Pessoa {

    private Double gastosSaude;


    public PessoaFisica() {
        super();
    }


    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return this.gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public double calcRenda() {
       return (rendaAnual * 0.25) - (gastosSaude * 0.5);
    }





}
