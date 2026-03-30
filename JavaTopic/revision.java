// 💻 Example Program: Control Statements in Action

// public class revision {
//     public static void main(String[] args) {
//         int num = 10;

//         // 1. Decision Making
//         if (num > 0) {
//             System.out.println("Number is positive");
//         } else {
//             System.out.println("Number is not positive");
//         }

//         // if-else-if ladder
//         if (num == 0) {
//             System.out.println("Number is zero");
//         } else if (num % 2 == 0) {
//             System.out.println("Number is even");
//         } else {
//             System.out.println("Number is odd");
//         }

//         // switch statement
//         int day = 3;
//         switch (day) {
//             case 1: System.out.println("Monday"); break;
//             case 2: System.out.println("Tuesday"); break;
//             case 3: System.out.println("Wednesday"); break;
//             default: System.out.println("Other day");
//         }

//         // 2. Looping
//         System.out.println("For loop:");
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("i = " + i);
//         }

//         System.out.println("While loop:");
//         int j = 1;
//         while (j <= 3) {
//             System.out.println("j = " + j);
//             j++;
//         }

//         System.out.println("Do-while loop:");
//         int k = 1;
//         do {
//             System.out.println("k = " + k);
//             k++;
//         } while (k <= 2);

//         // 3. Jump Statements
//         System.out.println("Break and Continue:");
//         for (int x = 1; x <= 5; x++) {
//             if (x == 3) continue; // skip 3
//             if (x == 5) break;    // stop loop at 5
//             System.out.println("x = " + x);
//         }
//     }
// }


///////////////////////////////////////////////////////////////////////
/// 
/// 
/// object and classes
/*Classes and Objects in Java
📖 Theory
Class: A blueprint or template that defines attributes (variables) and behaviors (methods).

Object: An instance of a class. It represents a real-world entity created from the class blueprint.

Key idea: A class is like a design of a car, and an object is the actual car you drive. */


// Class definition
class Student {
    // Attributes (instance variables)
    String name;
    int age;

    // Method (behavior)
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class
public class revision {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student s1 = new Student();
        Student s2 = new Student();

        // Assigning values to object attributes
        s1.name = "aman";
        s1.age = 21;

        s2.name = "Rahul";
        s2.age = 22;

        // Calling methods on objects
        s1.displayInfo(); // Output: Name: aman, Age: 21
        s2.displayInfo(); // Output: Name: Rahul, Age: 22
    }
}
