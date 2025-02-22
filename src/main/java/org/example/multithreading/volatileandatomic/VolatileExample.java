package org.example.multithreading.volatileandatomic;

public class VolatileExample {

    private static volatile boolean running = true; // Shared variable volatile

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread started...");
            while (running) {
                System.out.println("Thread is running");
            }
            System.out.println("Thread stopped.");
        });

        thread.start();

        Thread.sleep(1000); // Allow thread to start and run
        running = false;    // Main thread updates the variable
        System.out.println("Main thread updated running to false.");
    }

}
