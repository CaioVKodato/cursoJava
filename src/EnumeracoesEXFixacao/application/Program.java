package EnumeracoesEXFixacao.application;

import EnumeracoesEXFixacao.entities.Client;
import EnumeracoesEXFixacao.entities.Order;
import EnumeracoesEXFixacao.entities.OrderItem;
import EnumeracoesEXFixacao.entities.Product;
import EnumeracoesEXFixacao.entitiesENUM.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = teclado.nextLine();
        System.out.print("Email: ");
        String email = teclado.nextLine();
        System.out.print("Birth date: DD/MM/YYYY: ");
        Date birth = sdf.parse(teclado.next());

        Client cliente = new Client(name,email,birth);
        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Order status: ");
        OrderStatus status = OrderStatus.valueOf(teclado.next());

        Order order = new Order(new Date(),status,cliente);

        System.out.print("How many items to this order? ");
        int N = teclado.nextInt();
        System.out.println();

        for (int i=0; i<N; i++) {
            System.out.println("Enter a #" + (i+1) + " item data");
            System.out.print("Product name: ");
            teclado.nextLine();
            String productName = teclado.nextLine();
            System.out.print("Product price: ");
            double productPrice = teclado.nextDouble();
            System.out.print("Quantity: ");
            int quantity = teclado.nextInt();
            System.out.println();

            Product product = new Product(productName,productPrice);

            OrderItem it = new OrderItem(quantity,productPrice,product);

            order.addItems(it);
        }

        System.out.println();
        System.out.println(order);
    }
}
