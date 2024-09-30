package ProgramaçaoLambda.Exercicios.ExFixacao.entities;

public class Employee {
    private String name;
    private Double salario;
    private String email;


    public Employee() {
    }

    public Employee(String name, String email,Double salario) {
        this.name = name;
        this.salario = salario;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
