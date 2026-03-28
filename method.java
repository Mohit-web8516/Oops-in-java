//instance method
// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }
// }
// public class method {
//     public static void main(String[] args) {
//         Calculator c = new Calculator();
//         System.out.println(c.add(5, 3)); // 8
//     }
// }


//static method

// class MathUtil {
//     static int square(int x) {
//         return x * x;
//     }
// }
// public class method{
//     public static void main(String[] args) {
//         System.out.println(MathUtil.square(4)); // 16
//     }
// }


//Parameterized Methods


// class Greeting {
//     void sayHello(String name) {
//         System.out.println("Hello, " + name);
//     }
// }
// public class method {
//     public static void main(String[] args) {
//         Greeting g = new Greeting();
//         g.sayHello("Alex"); // Hello, Alex
//     }
// }


//Return-Type Methods

// class Circle {
//     double area(double radius) {
//         return 3.14 * radius * radius;
//     }
// }
// public class method {
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         System.out.println("Area: " + c.area(5)); // 78.5
//     }
// }


//: Method Overloading


class Printer {
    void print(int num) {
        System.out.println("Printing number: " + num);
    }
    void print(String text) {
        System.out.println("Printing text: " + text);
    }
}

public class method {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);       // Output: Printing number: 100
        p.print("Hello");   // Output: Printing text: Hello
    }
}
