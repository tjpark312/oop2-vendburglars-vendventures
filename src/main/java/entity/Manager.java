package entity;

public class Manager {
    private String email;
    private String password;
    private String name;

    // constructor
    public Manager(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    // getter/setter
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
    public String getName() {
        return this.name; }
}
