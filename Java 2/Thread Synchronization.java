// What Is Thread Synchronization?

/*
Thread synchronization is a way to ensure that two or more threads can safely share data without causing conflicts. 
Imagine you and your friend trying to use the same notebook at the same time. 
If you both write in it at once, the notes might get mixed up. 
Synchronization makes sure that only one person writes in the notebook at a time.
*/

// Why Use Thread Synchronization?
/*
1. Data Integrity: When multiple threads try to read and write to the same resource (like a variable or file), 
   synchronization prevents data corruption. It ensures that one thread completes its operation before another one starts.

2. Avoid Race Conditions: A race condition occurs when two threads try to change the same data simultaneously. 
   Synchronization helps manage this by controlling access to shared resources.

3. Consistent State: By synchronizing threads, you can keep your application in a consistent state. 
   For example, if one thread is updating a bank account balance, you want to make sure no other thread is reading or writing to it at the same time.
*/

// How to Implement Thread Synchronization
/*
In Java, you can synchronize methods or blocks of code using the `synchronized` keyword.
*/

// Example
class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Safely increments the count
        }
    }
}

class ThreadSynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two threads that will increment the counter
        IncrementThread thread1 = new IncrementThread(counter);
        IncrementThread thread2 = new IncrementThread(counter);

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2

        try {
            thread1.join(); // Wait for thread 1 to finish
            thread2.join(); // Wait for thread 2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Count: " + counter.getCount()); // Output the final count
    }
}

/*
 * What Happens in the Example?
 * - We have a `Counter` class that increments a count.
 * - The `increment` method is synchronized, meaning only one thread can execute
 * it at a time.
 * - Two threads increment the count simultaneously, but synchronization ensures
 * that the count remains accurate.
 * 
 * Important Note:
 * - Without synchronization, both threads could read the same value at the same
 * time, leading to incorrect results.
 * - Synchronization may slow down your program a bit because it prevents
 * multiple threads from working on the same resource at the same time. However,
 * it is crucial for maintaining data integrity.
 * 
 * /*
 * Summary
 * /*
 * - Thread synchronization ensures safe access to shared resources by multiple
 * threads.
 * - It prevents data corruption, avoids race conditions, and keeps your
 * application consistent.
 */



 // Example: Bank Account

class BankAccount {
    private int balance = 0; // Shared resource (balance)

    // Synchronized method to safely deposit money
    public synchronized void deposit(int amount) {
        // Only one thread can execute this method at a time
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private int amount;

    DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        // Each thread tries to deposit money
        for (int i = 0; i < 5; i++) {
            account.deposit(amount); // Accessing the synchronized method
            try {
                Thread.sleep(100); // Sleep for a while to simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadSynchronizationExample2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Create two threads that will deposit money into the account
        DepositThread thread1 = new DepositThread(account, 100);
        DepositThread thread2 = new DepositThread(account, 200);

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2

        try {
            thread1.join(); // Wait for thread 1 to finish
            thread2.join(); // Wait for thread 2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Balance: " + account.getBalance()); // Output the final balance
    }
}

/*
 * In This Example:
 * 1. We have a `BankAccount` class with a shared resource `balance`.
 * 2. The `deposit` method is synchronized, which means only one thread can
 * execute it at a time.
 * 3. Two threads (`thread1` and `thread2`) are trying to deposit money into the
 * same bank account.
 * 4. The `deposit` method ensures that deposits happen one at a time,
 * preventing any incorrect calculations of the balance.
 * 5. Finally, we print the final balance to see the result.
 * 
 * Why Is Synchronization Important Here?
 * - If we didn't synchronize the `deposit` method, both threads could access
 * the `balance` variable at the same time, causing incorrect results.
 * - For example, if both threads read the balance as 0 at the same time and
 * then add their amounts, you could end up with a balance that's incorrect
 * (like just the last deposit instead of the total).
 */

// Summary
/*
 * Thread synchronization ensures that shared resources are accessed in a
 * controlled way,
 * preventing data corruption and ensuring correct results.
 */