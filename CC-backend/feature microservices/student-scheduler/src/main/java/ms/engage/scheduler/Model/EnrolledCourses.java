package ms.engage.scheduler.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc_courses_enrolled")
public class EnrolledCourses {
    
    @Id
    @GeneratedValue
    private int id;

    String username;
    String coursecode;
    
    public EnrolledCourses() {
    }

    public EnrolledCourses(String username, String coursecode) {
        this.username = username;
        this.coursecode = coursecode;
    }
    
    @Override
    public String toString() {
        return "EnrolledCourses [coursecode=" + coursecode + ", id=" + id + ", username=" + username + "]";
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
    public String getCoursecode() {
        return coursecode;
    }
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    
    
}
