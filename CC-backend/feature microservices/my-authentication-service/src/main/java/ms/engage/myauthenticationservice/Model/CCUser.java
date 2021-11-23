package ms.engage.myauthenticationservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc_users")
public class CCUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private boolean active;
    private String role;

    @Override
    public String toString() {
        return "CCUser [active=" + active + ", id=" + id + ", password=" + password + ", role=" + role + ", username=" + username + "]";
    }

    @Override
    public boolean equals(Object obj){
        CCUser that = (CCUser) obj;
        return this.getUsername().equals(that.getUsername()) && this.getRole().equals(that.getRole());
    }

    public CCUser() { }

    public CCUser(String username, String password, String role) {
        this.id = -1;
        this.username = username;
        this.password = password;
        this.active = true;
        this.role = role;
    }

    public CCUser(int id, String username, String password, boolean active, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}