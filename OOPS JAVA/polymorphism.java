// In Java,polymorphism is the ability of an object to take on many forms.It allows you to write code that can work with objects of different classes in a generic way,without needing to know their specific types.There are two main types of polymorphism in Java:

//Compile-time polymorphism(static polymorphism):Achieved through method overloading.This is where multiple methods in the same class have the same name,but different parameters.The compiler determines which method to call based on the number and types of arguments passed at compile time

// Runtime polymorphism (dynamic polymorphism): Achieved through method overriding. This is where a subclass provides a specific implementation of a method that is already defined in its superclass. The actual method called is determined at runtime based on the object's actual type.
// Example:

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Output: "Dog barks"
        animal2.makeSound(); // Output: "Cat meows"
    }
}
// Benefits of polymorphism:
// Flexibility:
// Write code that can work with different object types, promoting code reuse and adaptability.
// Extensibility:
// Easily add new subclasses without modifying existing code that uses the superclass.
// Maintainability:
// Makes code easier to understand and modify, as it reduces the need for type-specific logic.