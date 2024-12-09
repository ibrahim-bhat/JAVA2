/*1. Method Overriding Definition:Method overriding in Java allows a subclass(child class)to provide a specific implementation of a method that is already defined in its superclass(parent class).The method in the child  class has the same method name, return type, and parameter list as the method in the parent class

Why Use Overriding?: It allows a child class to tailor the behavior of a method based on its specific needs while retaining the same method signature. */

// Example:


class Animal {
            void sound() {
                System.out.println("Animal makes a sound");
            }
        }

        class Dog extends Animal {
            @Override
            void sound() { // Overriding the sound() method
                System.out.println("Dog barks");
            }
        }

        public class methodoverriding {
            public static void main(String[] args) {
                Animal myDog = new Dog();
                myDog.sound(); // Output: Dog barks
            }
}