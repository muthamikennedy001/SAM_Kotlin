package rsk.java;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }
    //create method is used to fire an event when the user has been created
    public void create(Created created){
        created.onCreate(this);

    }
    //toString method creates the name of the current user
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
