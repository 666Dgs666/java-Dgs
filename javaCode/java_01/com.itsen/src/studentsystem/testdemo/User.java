package studentsystem.testdemo;

public class User {
    private String name;
    private String passward;
    private String id;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(String name, String passward, String id, String phoneNumber) {
        this.name = name;
        this.passward = passward;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }
}
