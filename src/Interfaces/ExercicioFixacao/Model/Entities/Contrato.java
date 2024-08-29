package Interfaces.ExercicioFixacao.Model.Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Contrato {
    private Integer numeroContract;
    private LocalDate dataContract;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contrato(Integer numeroContract, LocalDate dataContract, Double totalValue) {
        this.numeroContract = numeroContract;
        this.dataContract = dataContract;
        this.totalValue = totalValue;
    }
    
    public Integer getNumeroContract() {
        return this.numeroContract;
    }

    public void setNumeroContract(Integer numeroContract) {
        this.numeroContract = numeroContract;
    }

    public LocalDate getDataContract() {
        return this.dataContract;
    }

    public void setDataContract(LocalDate dataContract) {
        this.dataContract = dataContract;
    }
   
    public Double getTotalValue() {
        return this.totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return this.installments;
    }


}
