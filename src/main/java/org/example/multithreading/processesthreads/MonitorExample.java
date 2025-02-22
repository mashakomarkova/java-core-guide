package org.example.multithreading.processesthreads;

class SharedResource {
    public synchronized void display(String message) {
        System.out.println("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class MyThread2 extends Thread {
    SharedResource resource;
    String message;

    MyThread2(SharedResource resource, String message) {
        this.resource = resource;
        this.message = message;
    }

    public void run() {
        resource.display(message);
    }
}

public class MonitorExample {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread t1 = new MyThread2(resource, "Thread1");
        Thread t2 = new MyThread2(resource, "Thread2");

        t1.start();
        t2.start();
    }
}

