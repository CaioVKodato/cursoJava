package ProgramaçaoLambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7);
        Stream<Integer> s1 = list.stream().map(x -> x*10); 

        System.out.println(Arrays.toString(s1.toArray()));

        Stream<String> s2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(s2.toArray()));

        Stream<Integer> s3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(s3.limit(10).toArray()));

        Stream<Long> s4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1],p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(s4.limit(10).toArray()));
    }
}
