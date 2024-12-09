// Static Members in Java

// In Java, static members belong to the class rather than to any specific instance of the class.
// This means they are shared among all instances of the class. There are two main types of static members:
// 1. Static variables: Variables shared by all instances.
// 2. Static methods: Methods that can be called without creating an instance of the class.

//it can we called without creating any object

// Why Use Static Members?
// Static members are useful when you need to keep track of a value or functionality 
// that should be shared across all instances of a class, like a counter that counts how many objects have been created.

class Counter {
    // Static variable to count the number of objects created
    static int count = 0;    //it is class variable (but for instance that is object variable   )

    // Constructor increments the counter each time a new object is created
    Counter() {
        count++;
    }

    // Static method to display the count value
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        // Creating objects
        new Counter();
        new Counter();
        new Counter();

        // Calling the static method without creating an instance
        Counter.displayCount(); // Output: Number of objects created: 3
    }
}
