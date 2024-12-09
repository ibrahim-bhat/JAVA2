// In Java,an**instance**is a specific realization of a class,also known as an**object**.When you create an object from a class,you are creating an"instance"of that class.This instance has its own set of properties(instance variables)and can use the class’s methods.

// ###Example to Understand Instances

// Think of a**class**like a blueprint for a car,defining general attributes like the color,model,and type.The**instance**of this car would be an actual car built using the blueprint,with specific values for these attributes.

// ####Basic Example Let’s say we have a
// class called`Car`:

class Car {
        // Instance variables
        String color;
        String model;

        // Method
        void startEngine() {
            System.out.println("The engine is starting...");
        }
    }

//     Here:-`Car`

//     is the**class**
//     that defines

//     properties (`color` and `model`)

//     and behaviors (`startEngine()`).
// - An **instance** of `Car` will be an actual object that has a specific color and model and can start its engine.

// #### Creating an Instance
// To create

//     an instance (or object) of this class, we use the `new` keyword:

public class instance {
    public static void main(String[] args) {
        // Creating an instance of Car
        Car myCar = new Car();
        
        // Setting instance variables
        myCar.color = "Red";
        myCar.model = "Sedan";
        
        // Using the instance's method
        System.out.println("Car color: " + myCar.color);
        System.out.println("Car model: " + myCar.model);
        myCar.startEngine();
    }
}


// In this example:
// - `myCar` is an **instance** of the `Car` class.
// - We set the `color` and `model` for `myCar` to "Red" and "Sedan," which are specific to this instance.
// - When we call `myCar.startEngine()`, it runs the `startEngine` method for this particular `myCar` object.

// ### Output:
// ```plaintext
// Car color: Red
// Car model: Sedan
// The engine is starting...
// ```

// ### Key Points
// - Each instance of a class can have its own values for instance variables.
// - You can create multiple instances of the same class, each with different values.

// Creating instances lets us build specific, usable objects based on the blueprint defined by the class.