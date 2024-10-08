package Generics.Delimitados.entities;

public class Produto implements Comparable<Produto> {
    private String name;
    private Double price;

    public Produto() {
    }

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return name +" = " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Produto other) {
        return price.compareTo(other.getPrice());
    }

}
