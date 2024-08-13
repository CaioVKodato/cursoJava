package Polimorfismo.ExResolvido.entities;

public class OutsourceEmployee extends Employee {

    private Double additionalCharge;


    public OutsourceEmployee() {
        super();
    }



    public OutsourceEmployee(String name, Integer hours, Double valuePerhour,Double additionalCharge) {
        super(name, hours, valuePerhour);
        this.additionalCharge = additionalCharge;
    }


    public Double getAdditionalCharge() {
        return this.additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final Double payament() {
        return hours * valuePerHour + (additionalCharge * 1.1);
    }
    


}
