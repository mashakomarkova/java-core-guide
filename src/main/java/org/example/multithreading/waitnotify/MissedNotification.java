package org.example.multithreading.waitnotify;

public class MissedNotification {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread is waiting...");
                    lock.wait(); // Waiting for notification
                    System.out.println("Thread resumed!");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread notifyingThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Sending notification...");
                lock.notify(); // Notify waiting thread
            }
        });

        notifyingThread.start(); // Notification sent before wait
        waitingThread.start(); // Starts waiting after notification
    }
}

