package entity;

public class Manager {
    private String email;
    private String password;
    private String name;

    // 싱글톤 패턴??
    // 생성자 생성하기
    public Manager(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    // getter/setter 생성하기
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
