import java.util.Random;

public class User {
    private String name, id, role;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }

    public void setID(){
        Random rand = new Random();
        int data = rand.nextInt(10000);
        this.id = String.format("%04d", data);
    }

    public String getId() {
        return this.id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public int getAge() {
        return this.age;
    }

    protected void addPrefixCodeToId(String prefix){
        this.id = prefix+this.id;
    }


    @Override
    public String toString() {
        return "name: " + this.name + "\n" +
                "id: " + this.id + "\n" +
                "role: " + this.role + "\n" +
                "age: " + this.age;
    }
}
