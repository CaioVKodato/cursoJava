package Interfaces.ExercicioFixacao.Model.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private LocalDate date;
    private Double amount;
    
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Installment() {
    }


    public Installment(LocalDate date, Double amount) {
        this.date = date;
        this.amount = amount;
    }


    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return date.format(fmt) + " - " + String.format("%.2f", amount);
    }


}
