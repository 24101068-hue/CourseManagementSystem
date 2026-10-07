public class Student extends User{
    public Student(String name, int age) {
        super(name, age);
    }

    protected void addPrefixCodeToId(String prefix) {
        prefix = "S-";
        super.addPrefixCodeToId(prefix);
    }

    @Override
    public void setRole(String role) {
        role = "Student";
        super.setRole(role);
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
