package entitiesDesafioPensionato;

public class Hotel {
    private String name;
    private String email;

    public Hotel(){

    }

    public Hotel (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ", " + email
    }
}
