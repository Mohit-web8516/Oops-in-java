// public class variable {
    // Instance variable
//     int instanceVar = 10;

//     // Static variable
//     static int staticVar = 20;

//     public void showVariables() {
//         // Local variable
//         int localVar = 30;

//         System.out.println("Instance Variable: " + instanceVar);
//         System.out.println("Static Variable: " + staticVar);
//         System.out.println("Local Variable: " + localVar);
//     }

//     public static void main(String[] args) {
//         variable obj1 = new variable();
//         variable obj2 = new variable();

//         obj1.showVariables();
//         obj2.showVariables();

//         // Changing static variable
//         variable.staticVar = 50;

//         System.out.println("After changing static variable:");
//         obj1.showVariables();
//         obj2.showVariables();
//     }
// }


/*Types of Variables in Java
Local Variables → Declared inside methods, accessible only within that method.

Instance Variables → Declared inside a class but outside methods, belong to objects.

Static Variables → Declared with static, belong to the class (shared across all objects). */


class Student {
    // Instance variables (belong to each object)
    String name;
    int age;

    // Static variable (shared by all objects)
    static String college = "ABC University";

    void setDetails(String n, int a) {
        // Local variable (exists only inside this method)
        String prefix = "Student: ";
        name = n;
        age = a;
        System.out.println(prefix + name + " details set.");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }
}

public class variable {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setDetails("Viruuu", 21);
        s2.setDetails("Rahul", 22);

        s1.display(); // Output: Name: Viruuu, Age: 21, College: ABC University
        s2.display(); // Output: Name: Rahul, Age: 22, College: ABC University
    }
}

