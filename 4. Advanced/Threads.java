// Multithreading allows your program to run tasks in parallel using multiple threads.
// You can extend Thread or implement Runnable
// start() begins execution in a new thread
// run() defines what the thread does

class MyTask extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class Threading {
    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();

        t1.start(); // Runs in parallel
        t2.start();
    }
}
