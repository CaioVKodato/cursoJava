package applicationRevi;

import entitiesRevi.Product;
import entitiesRevi.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height= ");

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.print("AREA = ");
        System.out.println(rectangle.area());

        System.out.print("PERIMETER = ");
        System.out.println(rectangle.perimeter());

        System.out.print("DIAGONAL = ");
        System.out.println(rectangle.diagonal());

        sc.close();
    }
}
