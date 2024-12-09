 class expectations {

         public static void main(String[] args) {
             try {
                 // Code that might throw an exception
                 int a = 10;
                 int b = 0;
                 int result = a / b; // This will cause an ArithmeticException
                 System.out.println("Result: " + result);
             } catch (ArithmeticException e) {
                 // Handles ArithmeticException (division by zero in this case)
                 System.out.println("Cannot divide by zero. Error: " + e);
             } finally {
                 // Code in finally block always executes
                 System.out.println("This block runs regardless of exception.");
             }

             // Example of using throw
             try {
                 validateAge(15); // This will throw an exception because age < 18
             } catch (Exception e) {
                 System.out.println("Exception caught: " + e.getMessage());
             }
         }

         // Method to demonstrate throw keyword
         static void validateAge(int age) throws Exception {
             if (age < 18) {
                 throw new Exception("Age must be 18 or older to proceed.");
             } else {
                 System.out.println("Access granted - age verified.");
             }
         }
     }




    //  Exception handling in Java helps manage and handle runtime errors (exceptions) that may occur during program execution. Proper exception handling allows a program to respond to errors gracefully, rather than crashing.

/* 
    1. What is an Exception?
    An exception is an event that disrupts the normal flow of a program.When an error occurs in a Java program, an exception object is created, containing information about the error (like type, location, etc.).

Examples of exceptions include division by zero, accessing an out-of-bounds index, and null pointer errors.

2. Why Use Exception Handling?
Helps prevent program crashes.
Provides a way to handle errors gracefully and recover from them.
Makes debugging easier by identifying the source and type of error.

3. Key Exception Handling Keywords:
try: Used to wrap code that might throw an exception.
catch: Catches and handles specific exceptions.
finally: Executes code whether an exception occurs or not.
throw: Used to explicitly throw an exception.
throws: Declares exceptions that a method might throw.


Throw 

the throw keyword is used to explicitly throw an exception, either built-in or user-defined. Unlike exceptions that occur naturally during runtime (like NullPointerException or ArithmeticException), throw allows us to create exceptions deliberately to handle specific situations or errors in our code.
*/