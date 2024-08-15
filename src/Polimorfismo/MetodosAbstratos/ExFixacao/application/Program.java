package Polimorfismo.MetodosAbstratos.ExFixacao.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.MetodosAbstratos.ExFixacao.entities.Pessoa;
import Polimorfismo.MetodosAbstratos.ExFixacao.entities.PessoaFisica;
import Polimorfismo.MetodosAbstratos.ExFixacao.entities.PessoaJuridica;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = teclado.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char typeImpost = teclado.next().charAt(0);
            teclado.nextLine();
            System.out.print("Name: ");
            String name = teclado.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = teclado.nextDouble();
            
            if (typeImpost == 'i') { 
            System.out.print("Health expenditures: ");
            double gastosSaude = teclado.nextDouble();

            pessoas.add(new PessoaFisica(name, anualIncome, gastosSaude));
            }
            else if (typeImpost == 'c') {
                System.out.print("Number of employees: ");
                int numEmpregados = teclado.nextInt();

                pessoas.add(new PessoaJuridica(name, anualIncome, numEmpregados));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        
        double soma = 0.0;

        for (Pessoa pss: pessoas) {
            soma += pss.calcRenda();
            System.out.println(pss.getName() + ": $" + String.format("%.2f", pss.calcRenda()));
        }

        System.out.print("Total taxes: $" + String.format("%.2f", soma));


        teclado.close();
    }
}
