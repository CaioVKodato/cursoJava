package entitiesRevi;

public class Nota {

    public String name;

    public double nota1;

    public double nota2;

    public double nota3;

    public double FinalGrade() {
        return nota1 + nota2 + nota3;
    }

    public double MissingPoints() {
        if (FinalGrade() >= 60) {
            return 0;
        }
        else {
            return 60 - FinalGrade();
        }
    }
}
