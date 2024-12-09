
// ### What is Multithreading?
// Imagine you’re doing several tasks at once, like listening to music, reading, and cooking. In a program, this is called **multithreading**—the ability to run multiple parts of a program (called *threads*) at the same time.

// In Java, **threads** help run parts of a program simultaneously, which can make things faster and more efficient. For example, while one thread handles loading data, another can manage user interactions, making the program feel faster.

// ### Why Use Threads?
// 1. **Efficiency**: It makes better use of your computer’s CPU by not wasting time waiting for each task to finish one by one.
// 2. **Improves User Experience**: Programs feel quicker because they don’t freeze or delay when doing several tasks at once.

// ### How to Create Threads in Java
// There are two common ways to create a thread in Java:
// 1. **By extending the `Thread` class**
// 2. **By implementing the `Runnable` interface**

// Let’s look at examples for each approach.

// ### 1. Extending the `Thread` Class
// This is one way to create a thread, by making a class that extends `Thread`. Here’s how it works:

// Step 1: Create a class that extends Thread
class MyThread extends Thread {
    // Step 2: Override the run() method to define the task
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread is running, iteration: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds (0.5 seconds)
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

// Main class to start the thread
public class multithreading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(); // Create a thread object
        thread1.start(); // Start the thread, calling run() in a new thread
    }
}

// ### Explanation:
// - **`MyThread` Class**: Extends `Thread` and overrides the `run()` method to define what the thread does. Here, it prints messages and pauses (`sleep`) briefly to simulate work.
// - **Starting the Thread**: Calling `start()` begins the thread and runs the `run()` method concurrently.

// ### 2. Implementing the `Runnable` Interface
// Another way to create threads is by implementing the `Runnable` interface. This is generally preferred because it’s more flexible.

// Step 1: Create a class that implements Runnable
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyRunnable is running, iteration: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

 class MainRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable(); // Create a runnable object
        Thread thread2 = new Thread(myRunnable); // Create a thread with the runnable
        thread2.start(); // Start the thread
    }
}

// ### Explanation:
// - **MyRunnable Class**: Implements `Runnable` and defines the `run()` method.
// - **Using a Runnable**: We create a `Thread` object with the `Runnable` instance and call `start()` to run it.

// ### Key Thread Methods
// - **`start()`**: Begins the thread, calling `run()` in a new thread.
// - **`run()`**: Defines the task to perform in the thread.
// - **`sleep(milliseconds)`**: Pauses the thread for a certain time.
  
// ### Why Use `Runnable`?
// Implementing `Runnable` is more flexible, especially when you want to create a thread in a class that already extends another class. It also helps in separating the task (`Runnable`) from the thread execution (`Thread`).

// ### Why Synchronization is Important
// When multiple threads access shared resources (like a variable or file), they might try to change it at the same time, causing unexpected results. **Synchronization** helps ensure that only one thread accesses the resource at a time to prevent conflicts.

// ### Quick Summary
// - **Multithreading** lets us run different parts of a program at the same time, improving efficiency and user experience.
// - We can create threads by extending `Thread` or implementing `Runnable`.
// - Threads help in doing tasks concurrently without blocking other parts of the program.

// This way, multithreading lets you design programs that are more responsive and faster, especially when handling tasks that can run independently.