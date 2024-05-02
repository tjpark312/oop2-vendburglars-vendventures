package manager;

public class Manager {
    private String email;
    private String password;
    private String name;
    Manager [] managers = new Manager[10];



    public Manager() {
    }

    public Manager(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean managerCheck() {
        if(managers.length == 0) {
            return false;
        }
        else {
            return true;
        }
    }


}
