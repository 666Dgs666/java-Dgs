package studentsystem.test_03;

public class User {
    public User(String id, String userName, String passward) {
        this.id = id;
        this.userName = userName;
        this.passward = passward;
    }
    public User() {
    }

    private String id;
    private String userName;
    private String passward;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }




}
