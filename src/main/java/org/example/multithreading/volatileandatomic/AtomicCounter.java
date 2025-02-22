package org.example.multithreading.volatileandatomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private AtomicInteger count = new AtomicInteger(0);
    //int i = 0;
    public void increment() {
        count.incrementAndGet();
      //  i++;
    }

    public int getCount() {
        return count.get();
       // return i;
    }
}
class AtomicDemo {
    public static void main(String[] args) {
        AtomicCounter counter = new AtomicCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}