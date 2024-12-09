// What Are Thread Priorities?

/*
Thread priorities help the computer decide which threads (smallest units of processing) are more important than others. 
Think of it like a line of people waiting to buy movie tickets. If someone has a higher priority (like VIP tickets), they get to go first.
*/

// Why Use Thread Priorities?
/*
1. Important Tasks First: If you have a task that needs to be done quickly (like handling user input), you can give it a higher priority. 
   This means it will have a better chance of running sooner compared to less important tasks.

2. Better Responsiveness: Higher priority threads can make your application feel more responsive. 
   For example, if a game has a thread that handles graphics, you want that thread to be able to run quickly so the game runs smoothly.

3. Manage Multiple Tasks: If your program does many things at once, like downloading files and updating the user interface, 
   you can set the downloading thread to a lower priority so it doesn’t interfere with the UI responsiveness.
*/

// How to Set Thread Priorities
/*
In Java, you can set thread priorities using constants:
- Thread.MIN_PRIORITY: The lowest priority (1).
- Thread.NORM_PRIORITY: The default priority (5).
- Thread.MAX_PRIORITY: The highest priority (10).
*/

// Example
class HighPriorityTask extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("High Priority Task - Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class LowPriorityTask extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Low Priority Task - Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

 class ThreadPriorityExample {
    public static void main(String[] args) {
        HighPriorityTask highTask = new HighPriorityTask();
        LowPriorityTask lowTask = new LowPriorityTask();

        highTask.setPriority(Thread.MAX_PRIORITY); // Set high priority
        lowTask.setPriority(Thread.MIN_PRIORITY); // Set low priority

        highTask.start(); // Start high priority task
        lowTask.start(); // Start low priority task
    }
}

/*
 * What Happens in the Example?
 * - In the example, we have two tasks:
 * - One with high priority (counts fast).
 * - One with low priority (counts slowly).
 * - The high-priority task gets more chances to run than the low-priority task.
 * 
 * Important Note:
 * - Not Always Guaranteed: Just because you set a thread’s priority doesn’t
 * mean it will always run first.
 * The computer's operating system has the final say in which thread runs when.
 * - Different Behaviors: Different systems might handle priorities differently,
 * so you should always test your application in the environment where it will
 * run.
 * 
 * // Summary
 * /*
 * - Thread priorities are a way to tell the computer which tasks are more
 * important.
 * - By setting priorities, you can help ensure that critical tasks run quickly,
 * making your applications more responsive and efficient.
 */
