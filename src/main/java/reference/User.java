package reference;

public class User {
    private int id;
    private String name;


    public User(int id,String name ) {
        super();
        this.id = id;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }
}
