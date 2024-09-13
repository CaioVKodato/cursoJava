package Map.Introducao.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "31991192931");

        cookies.remove("email");
        cookies.put("phone", "31996850212");

        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES");
        for (String key: cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
