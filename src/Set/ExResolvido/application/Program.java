package Set.ExResolvido.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import Set.ExResolvido.entities.LogEntry;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Enter a file full path: ");
        String path = teclado.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path) )) {
            
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();

            while (line != null) {
                String fields[] = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));
                
                line = br.readLine();
            }

            System.out.println("Total users: " + set.size());
            

        } catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
        }
        
        teclado.close();
    }
}
