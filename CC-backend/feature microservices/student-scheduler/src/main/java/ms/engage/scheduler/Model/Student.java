package ms.engage.scheduler.Model;

public class Student {
    String name;
    
    public Student() { }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor [name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

