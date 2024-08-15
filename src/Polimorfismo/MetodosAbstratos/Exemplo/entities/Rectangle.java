package Polimorfismo.MetodosAbstratos.Exemplo.entities;

public class Rectangle extends Shape{

    private Double widht;
    private Double height;


    public Rectangle() {
        super();
    }


    public Rectangle(Color color, Double widht, Double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }


    public Double getWidht() {
        return this.widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return widht * height;
    }




}
