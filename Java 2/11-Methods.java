// Example 1: A Simple Method Without Parameters
class Example1 {
    // This method prints a message
    void displayMessage() {
        System.out.println("Hello, this is a simple method!");
    }

    public static void main(String[] args) {
        Example1 ex = new Example1(); // Creating an instance of Example1
        ex.displayMessage(); // Calling the displayMessage() method
    }
}

// Example 2: A Method with Parameters
class Example2 {
    // This method takes two numbers and prints their sum
    void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        Example2 ex = new Example2(); // Creating an instance of Example2
        ex.addNumbers(5, 10); // Calling addNumbers() with parameters 5 and 10
    }
}

// Example 3: A Method with a Return Type
class Example3 {
    // This method calculates the square of a number and returns it
    int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Example3 ex = new Example3(); // Creating an instance of Example3
        int result = ex.square(4); // Calling square() and storing the result
        System.out.println("Square of 4 is: " + result);
    }
}

// Example 4: Method Overloading (Multiple Methods with the Same Name)
class Example4 {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Example4 ex = new Example4(); // Creating an instance of Example4
        int sum1 = ex.add(10, 20); // Calls the add(int, int) method
        int sum2 = ex.add(5, 15, 25); // Calls the add(int, int, int) method
        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
    }
}


/*methods are blocks of code designed to perform specific tasks. They help organize code into reusable pieces, making it easier to understand, maintain, and reuse. You can think of a method as a small "function" or "procedure" that performs a task or calculates a value when called.

Key Points About Methods
Definition: Methods are defined within a class and have a specific name that can be called to execute the code inside them.
Structure: They can have parameters (input values), return types (output), and a body where the code resides.
Purpose: Methods allow you to write code once and call it multiple times, which reduces repetition and makes code modular. 



Method Overloading
Method Overloading allows a class to have multiple methods with the same name but different parameters (types or numbers). It provides flexibility in method functionality.

java

*/