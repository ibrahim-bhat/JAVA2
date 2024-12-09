// Visibility Modifiers in Java

/*
Visibility modifiers (also known as access modifiers) define the accessibility of classes, methods, and variables in Java.
They control where these elements can be accessed from within the code.

There are four main visibility modifiers in Java:

1. **public**: 
   - The member is accessible from any other class.
   - It can be used anywhere in the application.

2. **private**: 
   - The member is accessible only within its own class.
   - It is not visible to any other classes.

3. **protected**: 
   - The member is accessible within its own package and by subclasses (even if they are in different packages).
   - It provides a moderate level of accessibility.

4. **default** (no modifier):
   - If no visibility modifier is specified, it is considered default.
   - The member is accessible only within its own package.

Example: Demonstrating the use of visibility modifiers.
*/

class Example {
    public int publicVar; // Accessible everywhere
    private int privateVar; // Accessible only within Example class
    protected int protectedVar; // Accessible within package and subclasses
    int defaultVar; // Default access (accessible within package)

    // Constructor to initialize variables
    Example(int publicVar, int privateVar, int protectedVar, int defaultVar) {
        this.publicVar = publicVar;
        this.privateVar = privateVar;
        this.protectedVar = protectedVar;
        this.defaultVar = defaultVar;
    }

    // Method to display the values of the variables
    void displayValues() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
    }
}

 class Test123 {
    public static void main(String[] args) {
        // Creating an object of Example class
        Example example = new Example(1, 2, 3, 4);

        // Accessing public variable directly
        System.out.println("Accessing public variable: " + example.publicVar);

        // Accessing private, protected, and default variables via method
        example.displayValues();
System.out.println("hello class");
        // The following line would cause a compile-time error:
        // System.out.println(example.privateVar); // Not accessible
    }
}

/*
 * Key Points:
 * - Visibility modifiers control access levels for classes, methods, and
 * variables.
 * - Use `public` for members that should be accessible everywhere.
 * - Use `private` for members that should be hidden from other classes.
 * - Use `protected` for members that should be accessible in subclasses.
 * - Use default access for package-private visibility.
 */
