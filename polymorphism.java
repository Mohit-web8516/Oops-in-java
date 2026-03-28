
//Method Overloading Example:

// class MathUtil {
//     int add(int a, int b) {
//         return a + b;
//     }
//     double add(double a, double b) {
//         return a + b;
//     }
// }

// public class polymorphism{
//     public static void main(String[] args) {
//         MathUtil m = new MathUtil();
//         System.out.println(m.add(5, 10));       // 15
//         System.out.println(m.add(5.5, 4.5));    // 10.0
//     }
// }



//Method Overriding Examples:

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Vehicle v = new Bike();  // Runtime polymorphism
        v.run();  // Output: Bike is running safely
    }
}
