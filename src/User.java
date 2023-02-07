import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    private String age;

    public User() {
    }

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.age = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return age;
    }

    public void setAddress(String address) {
        this.age = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + age + '\'' +
                '}';
    }
}
