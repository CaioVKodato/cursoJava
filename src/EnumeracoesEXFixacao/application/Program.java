package EnumeracoesEXFixacao.application;

import EnumeracoesEXFixacao.entities.Client;
import EnumeracoesEXFixacao.entities.Product;

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
        System.out.println("Birth date: DD/MM/YYYY: ");
        Date birth = sdf.parse(teclado.next());

        Client cliente = new Client(name,email,birth);
    }
}
