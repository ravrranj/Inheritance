# Inheritance
Types of inheritance and the way to implement it in our program in Java



🔹 1. Single Inheritance
➡ A child class inherits from a single parent class.


class Animal {  
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {  
    void bark() { System.out.println("Barking..."); }
}

public class Main {
    public static void main(String args[]) {  
        Dog d = new Dog();
        d.eat();  // Inherited method
        d.bark(); // Own method
    }  
}
✅ Output:

Eating...
Barking...
🔹 2. Multilevel Inheritance
➡ A class inherits from another class, which is itself inherited from another class.


class Animal {  
    void eat() { System.out.println("Eating..."); }
}

class Mammal extends Animal {  
    void walk() { System.out.println("Walking..."); }
}

class Dog extends Mammal {  
    void bark() { System.out.println("Barking..."); }
}

public class Main {
    public static void main(String args[]) {  
        Dog d = new Dog();
        d.eat();  // Inherited from Animal
        d.walk(); // Inherited from Mammal
        d.bark(); // Own method
    }  
}
✅ Output:

Eating...
Walking...
Barking...
🔹 3. Hierarchical Inheritance
➡ A single parent class is inherited by multiple child classes.


class Animal {  
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {  
    void bark() { System.out.println("Barking..."); }
}

class Cat extends Animal {  
    void meow() { System.out.println("Meowing..."); }
}

public class Main {
    public static void main(String args[]) {  
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }  
}
✅ Output:

Eating...
Barking...
Eating...
Meowing...
🔹 4. Multiple Inheritance (via Interfaces)
➡ Java does NOT support Multiple Inheritance using classes (to avoid ambiguity).
➡ But it supports Multiple Inheritance using Interfaces.


interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird {
    public void eat() { System.out.println("Bat is eating..."); }
    public void fly() { System.out.println("Bat is flying..."); }
}

public class Main {
    public static void main(String args[]) {  
        Bat b = new Bat();
        b.eat();
        b.fly();
    }  
}
✅ Output:

Bat is eating...
Bat is flying...
🚀 Summary of Java Inheritance Types
Type of Inheritance	Description	Example
Single	One child class inherits from one parent class	class Dog extends Animal
Multilevel	Child inherits from a class that also inherits from another class	class Dog extends Mammal extends Animal
Hierarchical	Multiple child classes inherit from the same parent class	class Dog extends Animal, class Cat extends Animal
Multiple (via Interfaces)	A class implements multiple interfaces	class Bat implements Animal, Bird
