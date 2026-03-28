// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class inheritence {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.sound();  // Output: Dog barks
//     }
// }



//EXAMPLEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE


class Employee {
    String name;
    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println(name + " is managing the team");
    }
}

public class inheritence {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "ALEX";
        m.work();        // Inherited method
        m.manageTeam();  // Manager-specific method
    }
}
