package EnumExercises.Ex1.entities;

import java.util.Date;

public class HourContract {
    
    private Date date;
    private Double valuePhora;
    private Integer hours;


    public HourContract() {
    }


    public HourContract(Date date, double valuePhora, int hours) {
        this.date = date;
        this.valuePhora = valuePhora;
        this.hours = hours;
    }


    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePhora() {
        return this.valuePhora;
    }

    public void setValuePhora(double valuePhora) {
        this.valuePhora = valuePhora;
    }

    public Integer getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePhora * hours;
    }
}
