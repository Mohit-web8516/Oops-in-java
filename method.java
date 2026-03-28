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


class Greeting {
    void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}
public class method {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.sayHello("Alex"); // Hello, Alex
    }
}
