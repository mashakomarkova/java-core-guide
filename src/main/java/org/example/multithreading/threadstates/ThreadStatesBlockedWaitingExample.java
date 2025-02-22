package org.example.multithreading.threadstates;

class SharedResource {
    synchronized void criticalSection() {
        System.out.println(Thread.currentThread().getName() + " is in the critical section.");
        try {
            Thread.sleep(2000); // Simulate work in critical section
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void waitForSignal() {
        System.out.println(Thread.currentThread().getName() + " is waiting for a signal.");
        try {
            wait(); // Causes the thread to go into WAITING state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is resumed.");
    }

    synchronized void sendSignal() {
        System.out.println(Thread.currentThread().getName() + " is sending a signal.");
        notify(); // Notifies waiting thread
    }
}

public class ThreadStatesBlockedWaitingExample {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Thread 1: Holds the lock and calls notify
        Thread thread1 = new Thread(() -> {
            resource.criticalSection();
            resource.sendSignal();
        }, "Thread-1");

        // Thread 2: Waits for a signal
        Thread thread2 = new Thread(() -> {
            resource.waitForSignal(); // Wait for signal
        }, "Thread-2");

        thread2.start();
        thread1.start();

        new Thread(() -> {
            while (thread1.isAlive() || thread2.isAlive()) {
                System.out.println("State of Thread-1: " + thread1.getState());
                System.out.println("State of Thread-2: " + thread2.getState());
                try {
                    Thread.sleep(500); // Check every 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "State-Monitor").start();
    }
}
