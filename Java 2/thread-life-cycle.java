/* 
The Thread Life Cycle in Java represents the different states a thread goes through during its execution. 
Each thread in Java has a life cycle, moving between states as it starts, runs, pauses, and completes its work. 
Let’s go through each stage and understand what happens in each state.
*/

/*
Thread Life Cycle Stages:
1. New: The thread is created but not started.
2. Runnable: The thread is ready to run and waiting for CPU time.
3. Blocked: The thread is paused, waiting for some condition or resource.
4. Waiting: The thread waits indefinitely until another thread signals it to continue.
5. Timed Waiting: The thread waits for a specified time, then moves back to runnable.
6. Terminated: The thread has completed its execution.
*/

/*
1. New State
   - What It Is: A thread is in the new state when it’s first created but hasn’t started yet.
   - How It Happens: This state occurs when you create a thread object but haven't called start() on it.
*/

// Thread t=new Thread(); // Thread is in New state

/*
2. Runnable State
   - What It Is: When you call start(), the thread enters the runnable state, ready to run. 
   - How It Happens: The thread is in this state when it's waiting for CPU allocation.
*/

// t.start(); // Thread is now Runnable

/*
3. Blocked State
   - What It Is: A thread enters the blocked state when it can’t proceed because it’s waiting for a resource that another thread holds.
   - How It Happens: This often occurs in synchronized code when one thread needs a lock already held by another.
*/

/*
4. Waiting State
   - What It Is: A thread in the waiting state pauses indefinitely, waiting to be notified by another thread.
   - How It Happens: This happens when a thread calls wait().
*/

// synchronized(object){object.wait(); // Moves to Waiting state
// }

/*
5. Timed Waiting State
   - What It Is: A thread is in timed waiting when it pauses for a specific time.
   - How It Happens: This occurs when methods like sleep(millis) or join(millis) are called.
*/

// Thread.sleep(1000); // Pauses for 1 second, moves to Timed Waiting

/*
6. Terminated State
   - What It Is: The terminated state indicates that the thread has finished execution.
   - How It Happens: This occurs when the run() method completes.
*/

// public void run(){
// Code to execute
// After this, thread goes to Terminated state
// }

/* 
Example Demonstrating Thread States:
Here’s a simple example to show how threads can transition through different states.
*/

class SampleThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");

        try {
            Thread.sleep(1000); // Moves to Timed Waiting state
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread has completed.");
    }
}

 class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        SampleThread thread = new SampleThread(); // New state
        System.out.println("Thread created in New state.");
        
        thread.start(); // Runnable state
        System.out.println("Thread started and moved to Runnable state.");
        
        try {
            thread.join(); // Makes main thread wait until thread completes
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        System.out.println("Thread has terminated.");
    }
}

/*
 * Summary:
 * - Threads move through different states as they run, wait, and complete.
 * - New: Created but not started.
 * - Runnable: Waiting to execute.
 * - Blocked/Waiting/Timed Waiting: Waiting for resources or time.
 * - Terminated: Finished execution.
 */
