package Interfaces.Exercicio.Application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Interfaces.Exercicio.Model.Entities.CarRental;
import Interfaces.Exercicio.Model.Entities.Vehicle;
import Interfaces.Exercicio.Model.Service.BrazilTaxService;
import Interfaces.Exercicio.Model.Service.RentalService;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = teclado.nextLine();
        System.out.println();
        Vehicle veiculo = new Vehicle(carModel);
        System.out.print("Qual é a data e hora da retirada do carro? ");
        LocalDateTime start = LocalDateTime.parse(teclado.nextLine(),fmt);
        System.out.print("Qual é a data e hora do retorno do carro? ");
        LocalDateTime finish = LocalDateTime.parse(teclado.nextLine(),fmt);

        CarRental alocacao = new CarRental(start,finish,veiculo);

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = teclado.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = teclado.nextDouble();

        RentalService rc = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rc.processInvoice(alocacao);
        System.out.println();
        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: $" + String.format("%.2f",alocacao.getInvoice().getBasicPayament()));
        System.out.println("Imposto: $" + String.format("%.2f", alocacao.getInvoice().getTax()));
        System.out.println("Pagamento total: $" + String.format("%.2f",alocacao.getInvoice().getTotalPayament()));



        teclado.close();
    }
}
