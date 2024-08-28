package Interfaces.Exercicio.Application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Interfaces.Exercicio.Model.Entities.CarRental;
import Interfaces.Exercicio.Model.Entities.Vehicle;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = teclado.nextLine();
        Vehicle veiculo = new Vehicle(carModel);
        System.out.print("Qual é a data e hora da retirada do carro? ");
        LocalDateTime start = LocalDateTime.parse(teclado.nextLine(),fmt);
        System.out.print("Qual é a data e hora do retorno do carro? ");
        LocalDateTime finish = LocalDateTime.parse(teclado.nextLine(),fmt);

        CarRental alocacao = new CarRental(start,finish,veiculo);

        teclado.close();
    }
}
