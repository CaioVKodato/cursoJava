package EnumExercises.Ex2.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH/mm/ss");

    private Integer likes;
    private Date moment;
    private String title;
    private String content;

    private List<Comment> comentarios = new ArrayList<>();

    public Post() {

    }

    public Post(String title, Date moment, String content, Integer likes) {
        this.title = title;
        this.moment = moment;
        this. content = content;
        this.likes = likes;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComentarios() {
        return this.comentarios;
    }

    public void addComment(Comment comentario) {
        comentarios.add(comentario);
    }

    public void removeComment(Comment comentario) {
        comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");

        for (Comment c : comentarios) {
            sb.append(c.getText() + "\n");
        }

        return sb.toString();
    }


}
