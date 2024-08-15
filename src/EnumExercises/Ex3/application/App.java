package EnumExercises.Ex3.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import EnumExercises.Ex3.entities.Client;
import EnumExercises.Ex3.entities.Order;
import EnumExercises.Ex3.entities.OrderItem;
import EnumExercises.Ex3.entities.Product;
import entitiesEnum.OrderStatus;

public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.println();
        System.out.print("Name: ");
        String name = teclado.nextLine();
        System.out.print("Email: ");
        String email = teclado.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(teclado.next());
        System.out.println();

        Client cliente = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(teclado.next());
        Order order = new Order(new Date(), status, cliente);

        System.out.print("How many items to this order? ");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            teclado.nextLine();
            String productName = teclado.nextLine();
            System.out.print("Product price: ");
            double productPrice = teclado.nextDouble();
            System.out.print("Quantity: ");
            int quantityProduct = teclado.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantityProduct, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("Order sumary: ");
        System.out.println(order);
        teclado.close();
    }


}