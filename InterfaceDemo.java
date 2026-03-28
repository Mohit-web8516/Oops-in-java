/*What is an Interface?
An interface is a collection of abstract methods (methods without body).

It defines a contract that classes must follow.

A class implements an interface using the implements keyword.

Interfaces support multiple inheritance in Java (a class can implement multiple interfaces).

From Java 8 onwards, interfaces can also have:

default methods (with body)

static methods */

//Example Program: Interface in Action


// Interface definition
interface Animal {
    void sound();   // abstract method
    void eat();     // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
    public void eat() {
        System.out.println("Cat drinks milk");
    }
}

// Public class name must match filename
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Dog barks
        a1.eat();   // Dog eats bones

        a2.sound(); // Cat meows
        a2.eat();   // Cat drinks milk
    }
}

