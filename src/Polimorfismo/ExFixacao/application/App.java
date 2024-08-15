package Polimorfismo.ExFixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.ExFixacao.entities.ImportedProduct;
import Polimorfismo.ExFixacao.entities.Product;
import Polimorfismo.ExFixacao.entities.UsedProduct;

public class App {
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        @SuppressWarnings("unused")
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = teclado.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c / u / i): ");
            char type = teclado.next().charAt(0);
            teclado.nextLine();
            System.out.print("Name: ");
            String name = teclado.nextLine();
            System.out.print("Price: ");
            double price = teclado.nextDouble();
            
            if (type == 'c') {
                Product produto = new Product(name, price);
                products.add(produto);
            }
            else if (type == 'u') {
                System.out.print("Manufacture date: ");
                LocalDate dataManufacture = LocalDate.parse(teclado.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product produto = new UsedProduct(name, price, dataManufacture);
                products.add(produto);
            }
            else if (type == 'i') {
                System.out.print("Custom fee: ");
                double customFee = 0.0;
                customFee = teclado.nextDouble();
                Product produto = new ImportedProduct(name, price, customFee);
                products.add(produto);
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product prod: products) {
            System.out.println(prod.priceTag());
        

    }
    teclado.close();
    }
}