// Definition of 'this' in Java
// 'this' is a reference variable in Java that refers to the current object of the class.
// It is commonly used to avoid ambiguity between instance variables and parameters,
// invoke other constructors, and pass the current object as a parameter.

class Student {
    String name;  // Instance variable
    int age;     // Instance variable

    // Constructor with parameters
    Student(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;   // 'this.age' refers to the instance variable
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age); // 'this' can be omitted here
    }
    
    // Method that accepts a Student object as a parameter
    void printStudentDetails(Student student) {
        System.out.println("Passed Student - Name: " + student.name + ", Age: " + student.age);
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("Alice", 20);
        
        // Displaying the student details
        student1.display(); // Output: Name: Alice, Age: 20
        
        // Passing the current object to another method
        student1.printStudentDetails(student1); // Output: Passed Student - Name: Alice, Age: 20
    }
}



/*this is a special keyword that refers to the current instance of a class. It is often used in instance methods and constructors to differentiate between instance variables (attributes) and parameters or to invoke other constructors in the same class. Here’s a breakdown of how this is commonly used:

1. Distinguishing Instance Variables from Parameters
When the names of parameters in a method or constructor match the names of instance variables, you can use this to differentiate between them.

2. Invoking Other Constructors
You can use this to call another constructor in the same class. This is called constructor chaining.

3. Passing Current Object as a Parameter
You can pass the current object to another method or constructor. */