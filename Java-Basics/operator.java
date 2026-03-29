// public class operator{
//     public static void main(String[] args){
//         int a = 2, b = 10;
//         System.out.println(a+b);
//         System.out.println(a*b);
//         System.out.println(a-b);
//     }
// }



//program to revise all the operator 


public class operator {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 7;
        System.out.println("d++: " + (d++)); // post-increment
        System.out.println("++d: " + (++d)); // pre-increment
        System.out.println("d--: " + (d--)); // post-decrement
        System.out.println("--d: " + (--d)); // pre-decrement

        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int e = 6, f = 3; // binary: 6=110, 3=011
        System.out.println("e & f: " + (e & f)); // AND
        System.out.println("e | f: " + (e | f)); // OR
        System.out.println("e ^ f: " + (e ^ f)); // XOR
        System.out.println("~e: " + (~e));       // NOT
        System.out.println("e << 1: " + (e << 1)); // Left shift
        System.out.println("e >> 1: " + (e >> 1)); // Right shift
    }
}
