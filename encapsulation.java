class Student {
    private String name;

    public void setName(String name) {
        this.name = name;  // Setter
    }

    public String getName() {
        return name;       // Getter
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("john");
        System.out.println("Student name: " + s.getName());
    }
}
