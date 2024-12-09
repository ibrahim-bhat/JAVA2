// Operators in Java

/*
 * What are Operators?
 * Operators are special symbols or keywords in Java used to perform operations on variables and values.
 * They allow us to manipulate data, make decisions, and execute computations within a program.
 */

/*
 * Types of Operators in Java:
 * 1. Arithmetic Operators
 * 2. Assignment Operators
 * 3. Comparison (Relational) Operators
 * 4. Logical Operators
 * 5. Increment/Decrement Operators
 */ 

/*
 * 1. Arithmetic Operators
 * Used to perform basic mathematical operations.
 * + : Addition
 * - : Subtraction
 * * : Multiplication
 * / : Division
 * % : Modulus (remainder after division)
 */
class Operators {
    public static void main(String[] args) {
        
    
int a = 10;
int b = 5;
System.out.println("Addition: " + (a + b)); // Output: 15
System.out.println("Subtraction: " + (a - b)); // Output: 5
System.out.println("Multiplication: " + (a * b)); // Output: 50
System.out.println("Division: " + (a / b)); // Output: 2
System.out.println("Modulus: " + (a % b)); // Output: 0

/*
 * 2. Assignment Operators
 * Used to assign values to variables.
 * =  : Simple assignment
 * += : Adds and assigns (x += y is same as x = x + y)
 * -= : Subtracts and assigns
 * *= : Multiplies and assigns
 * /= : Divides and assigns
 * %= : Modulus and assigns
 */
int x = 10;
x += 5; // Same as x = x + 5; x becomes 15
System.out.println("x after += : " + x);

/*
 * 3. Comparison (Relational) Operators
 * Used to compare two values, returns a boolean (true/false).
 * == : Equal to
 * != : Not equal to
 * >  : Greater than
 * <  : Less than
 * >= : Greater than or equal to
 * <= : Less than or equal to
 */
System.out.println("Is a equal to b? " + (a == b)); // Output: false
System.out.println("Is a greater than b? " + (a > b)); // Output: true

/*
 * 4. Logical Operators
 * Used to perform logical operations on boolean values.
 * && : Logical AND (both conditions must be true)
 * || : Logical OR (at least one condition must be true)
 * !  : Logical NOT (inverts the condition)
 */
boolean condition1 = true;
boolean condition2 = false;
System.out.println("AND: " + (condition1 && condition2)); // Output: false
System.out.println("OR: " + (condition1 || condition2)); // Output: true
System.out.println("NOT: " + !condition1); // Output: false

/*
 * 5. Increment/Decrement Operators
 * Used to increase or decrease the value of a variable by 1.
 * ++ : Increment
 * -- : Decrement
 */
int count = 10;
count++; // Same as count = count + 1; count becomes 11
System.out.println("Count after increment: " + count); // Output: 11
count--; // Same as count = count - 1; count becomes 10
System.out.println("Count after decrement: " + count); // Output: 10
}

}