package ms.engage.myauthenticationservice.Model;

public class CCSignupUser {
    private String username;
    private String password;
    private String role;

    @Override
    public String toString() {
        return "CCSignupUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    
    public CCSignupUser(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public CCSignupUser(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public CCSignupUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
}
