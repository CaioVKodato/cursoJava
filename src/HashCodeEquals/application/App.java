package HashCodeEquals.application;

import HashCodeEquals.entities.Cliente;

public class App {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("Maria", "maria@gmail.com");

        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode()); //Gera um código hash
        System.out.println(c1.equals(c2)); // True, os dois são iguais em questão de conteudo

        System.out.println(c1 == c2); //False, porque estão alocados em diferentes locais na memória

        System.out.println(s1 == s2); // True, pois existe um tratamento especial
    }
}
