package ms.engage.scheduler.Model;

public class Instructor {
    String name;
    
    public Instructor() { }

    public Instructor(String name) {
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
