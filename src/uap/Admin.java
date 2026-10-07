public class Admin extends User{
    public Admin(String name, int age) {
        super(name, age);
    }

    @Override
    protected void addPrefixCodeToId(String prefix) {
          prefix = "A-";
          super.addPrefixCodeToId(prefix);
    }

    @Override
    public void setRole(String role) {
        role = "Admin";
        super.setRole(role);
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
