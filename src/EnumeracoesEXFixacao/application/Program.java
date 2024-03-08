package EnumeracoesEXFixacao.application;

import EnumeracoesEXFixacao.entities.Client;
import EnumeracoesEXFixacao.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        Client client = new Client("Maria","maria@gmail.com",sdf.parse("20/10/2005"));
        System.out.println(client);
    }
}
