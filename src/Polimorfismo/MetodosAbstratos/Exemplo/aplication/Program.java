package Polimorfismo.MetodosAbstratos.Exemplo.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.MetodosAbstratos.Exemplo.entities.Circle;
import Polimorfismo.MetodosAbstratos.Exemplo.entities.Color;
import Polimorfismo.MetodosAbstratos.Exemplo.entities.Rectangle;
import Polimorfismo.MetodosAbstratos.Exemplo.entities.Shape;

public class Program {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = teclado.nextInt();

        for (int i=0; i < n; i++) {
            System.out.println("Shape #" + (i+1) + " data;");
            System.out.print("Rectangle or cicle (r/c)? ");
            char forma = teclado.next().charAt(0);

            System.out.print("Color (BLACK, BLUE, RED): ");
            Color color = Color.valueOf(teclado.next());
            if (forma == 'r') { 
            System.out.print("Width: ");
            double width = teclado.nextDouble();
            System.out.print("Heigth: ");
            double height = teclado.nextDouble();

            list.add(new Rectangle(color, width, height));
            }
            else if (forma == 'c') {
                System.out.print("Radius: ");
                double radius = teclado.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape forma: list) {
            System.out.println(String.format("%.2f", forma.area()));
        }

        teclado.close();
    }
}
