package Interfaces.ExercicioFixacao.Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Interfaces.ExercicioFixacao.Model.Entities.Contrato;
import Interfaces.ExercicioFixacao.Model.Entities.Installment;
import Interfaces.ExercicioFixacao.Model.Services.ContractService;
import Interfaces.ExercicioFixacao.Model.Services.PaypalService;

public class Program {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Number: ");
        int numberContract = teclado.nextInt();
        System.out.print("Date: ");
        LocalDate dataContract = LocalDate.parse(teclado.next(),fmt);
        System.out.print("Contract value: ");
        double totalValue = teclado.nextDouble();

        Contrato contract = new Contrato(numberContract, dataContract, totalValue);

        System.out.print("Entre com os numeros de parcelas: ");
        int n = teclado.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);
        
        System.out.println("Parcelas: ");
        for (Installment installments: contract.getInstallments()) {
            System.out.println(installments);
        }
        teclado.close();
    }
}
