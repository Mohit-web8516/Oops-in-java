/*1. Default Constructor
Provided automatically if you don’t define one.

Initializes objects with default values. */


// class Student {
//     String name;
//     int age;

//     // Default constructor
//     Student() {
//         name = "Unknown";
//         age = 0;
//         System.out.println("Default constructor called");
//     }

//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class constructor{
//     public static void main(String[] args) {
//         Student s1 = new Student(); // calls default constructor
//         s1.display(); // Output: Name: Unknown, Age: 0
//     }
// }


/////////////////////////////////////////////////
/// 
/*2.Parameterized Constructor
Accepts arguments to initialize fields with specific values.*/

// class Student {
//     String name;
//     int age;

//     // Parameterized constructor
//     Student(String n, int a) {
//         name = n;
//         age = a;
//         System.out.println("Parameterized constructor called");
//     }

//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         Student s2 = new Student("zyitt", 21); // calls parameterized constructor
//         s2.display(); // Output: Name: zyitt, Age: 21
//     }
// }


///////////////////////////////////////////////////////////
/*3. Copy Constructor
Initializes an object by copying another object’s values. */

// class Student {
//     String name;
//     int age;

//     // Parameterized constructor
//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }

//     // Copy constructor
//     Student(Student s) {
//         name = s.name;
//         age = s.age;
//         System.out.println("Copy constructor called");
//     }

//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         Student s2 = new Student("Rahul", 22); // parameterized
//         Student s3 = new Student(s2);          // copy constructor
//         s3.display(); // Output: Name: Rahul, Age: 22
//     }
// }




////////////////////////////////////////////////////
/// 