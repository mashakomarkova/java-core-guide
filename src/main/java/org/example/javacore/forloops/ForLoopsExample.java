package org.example.javacore.forloops;

public class ForLoopsExample {

    public static void main(String[] args) {
        for (int i = 0, n = 10; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Iteration: " + i);
        }

        int i = 5;
        for(; i < 10;) {
            i++;
            System.out.println("hello");
        }

        int[] numbers = {1, 2, 3, 4};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
