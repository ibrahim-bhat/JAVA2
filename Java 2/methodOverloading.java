// In Java, method overloading allows you to define multiple methods in the same class with the same name, but with different parameters. The compiler determines which method to call based on the number, type, and order of the arguments passed to the method. 
// Example:
// Java

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
// In this example, the Calculator class has three add methods with different
// parameter lists. The compiler will choose the appropriate method based on the
// arguments passed to it.
// Key Points:
// Method Name: The overloaded methods must have the same name.
// Parameter List: The overloaded methods must have different parameter lists,
// which can differ in:
// Number of parameters
// Type of parameters
// Order of parameters
// Return Type: The return type of overloaded methods can be the same or
// different.
// Access Modifiers: The access modifiers of overloaded methods can be the same
// or different.