// Variables in Java

/*
 * What are Variables?
 * Variables are containers used to store data values in a Java program.
 * Each variable has a specific data type that determines what type of data it can hold, 
 * such as integers, characters, decimals, etc.
 */

/*
 * Why use Variables?
 * Variables allow us to store data temporarily in memory while the program is running.
 * They make it easy to reference, manipulate, and update values throughout the code.
 */

/*
 * Rules for Naming Variables in Java:
 * 1. Must start with a letter, underscore (_), or dollar sign ($). 
 *    Numbers can be used but not as the first character.
 * 2. Cannot contain spaces.
 * 3. Must not be a reserved keyword (like `class`, `public`, `int`, etc.).
 * 4. By convention, use camelCase for variable names (e.g., myVariableName).
 */

/*
 * Syntax:
 * dataType variableName = value;
 * - dataType: Type of data the variable will hold (e.g., int, String, double).
 * - variableName: Name you choose for the variable.
 * - value: Optional; the initial value assigned to the variable.
 */

// Examples of different variable types:
class variables {
 public static void main(String[] args) {
    
// Integer variable
int age = 25; // stores whole numbers

// Double variable
double salary = 35000.75; // stores decimal values

// Character variable
char grade = 'A'; // stores a single character

// Boolean variable
boolean isActive = true; // stores true or false values

// String variable
String name = "ibrahim bhat"; // stores a sequence of characters

/*
 * Printing variables:
 * We can use System.out.println to output the values of variables.
 */
System.out.println("Age: " + age); // prints: Age: 25
System.out.println("Salary: " + salary); // prints: Salary: 35000.75
System.out.println("Grade: " + grade); // prints: Grade: A
System.out.println("Is Active: " + isActive); // prints: Is Active: true
System.out.println("Name: " + name); // prints: Name: John Doe
 }
}