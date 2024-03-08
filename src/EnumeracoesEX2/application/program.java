package EnumeracoesEX2.application;

import EnumeracoesEX2.entities.Comment;
import EnumeracoesEX2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip !");
        Comment c2 = new Comment("Wow that's awesome");
        Post p1 = new Post(sdf.parse("21/06/2024 13:05:44"),"Traveling to New Zeland",
                "I'm going to visit this wonderful country",12);
        p1.addComment(c1);
        p1.addComment(c2);


    }
}
