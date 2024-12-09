// Basics of Objects and Classes in Java

/*
What is a Class?
A class is a blueprint or template for creating objects. 
It defines the properties (attributes) and behaviors (methods) that the objects created from it will have.
Think of a class as a model for creating multiple objects.

Syntax:
class ClassName {
    // Fields (variables)
    // Methods (functions)
}

Example: A simple class representing a Car.
*/
class Car {
    // Fields (properties of the Car)
    String color; // Color of the car
    String model; // Model of the car
    int year; // Year of manufacture

    // Constructor to initialize the fields when a Car object is created
    Car(String color, String model, int year) {
        this.color = color; // Assigning color
        this.model = model; // Assigning model
        this.year = year; // Assigning year
    }

    // Method to display car information
    void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}

/*
 * What is an Object?
 * An object is an instance of a class(member of class). It represents a specific entity created
 * based on the class template.
 * Each object has its own state (values for its fields) and behavior (methods).
 * 
 * Creating an Object:
 * To create an object, we use the `new` keyword followed by the class
 * constructor.
 * 
 * Syntax:
 * ClassName objectName = new ClassName(parameters);
 */

class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2020);

        // Calling the method to display car information
        myCar.displayInfo(); // Output: Car Model: Toyota, Color: Red, Year: 2020
    }
}   

/*
 * Key Points:
 * - A class defines the structure (fields) and behavior (methods) of objects.
 * - An object is a specific instance of a class, with its own values for the
 * class's fields.
 * - Classes and objects form the foundation of Object-Oriented Programming
 * (OOP) in Java.
 */