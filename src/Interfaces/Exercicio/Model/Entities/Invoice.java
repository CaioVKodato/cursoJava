package Interfaces.Exercicio.Model.Entities;

public class Invoice {

    private Double basicPayament;
    private Double tax;
    

    public Invoice() {
    }


    public Invoice(Double basicPayament, Double tax) {
        this.basicPayament = basicPayament;
        this.tax = tax;
    }


    public Double getBasicPayament() {
        return this.basicPayament;
    }

    public void setBasicPayament(Double basicPayament) {
        this.basicPayament = basicPayament;
    }

    public Double getTax() {
        return this.tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayament() {
       return getBasicPayament() + getTax();
    }

}
