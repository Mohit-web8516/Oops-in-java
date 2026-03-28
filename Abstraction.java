// abstract class Shape {
//     abstract void draw();
// }

// class Circle extends Shape {
//     void draw() {
//         System.out.println("Drawing Circle");
//     }
// }

// public class Abstraction {
//     public static void main(String[] args) {
//         Shape s = new Circle();
//         s.draw();  // Output: Drawing Circle
//     }
// }



//exampleeeeeeeeeeeeeeeeeeeeeeeee 
abstract class Vehicle {
    abstract void start(); // abstract method
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start(); // Output: Car starts with a key
        v2.start(); // Output: Bike starts with a kick
    }
}

