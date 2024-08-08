package EnumExercises.Ex2.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import EnumExercises.Ex2.entities.Comment;
import EnumExercises.Ex2.entities.Post;

public class App {
    
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Post post1 = new Post("Traveling to New Zeland", sdf.parse("21/06/2022 13:05:44"), "I'm going to visit this wonderful country", 12);
        Post post2 = new Post("Good night guys", sdf.parse("19/05/2024 22:20:59"), "See you tomorrow", 5);

        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow, that's awesome! ");

        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");

        post1.addComment(comment1);
        post1.addComment(comment2);

        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println("----------------------------------------------------------");
        System.out.println(post2);

        
    }
}
