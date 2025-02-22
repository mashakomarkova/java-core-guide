package org.example.javacollections.copyonwritearraylist;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

//        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);

//
//        for (String fruit : list) {
//            System.out.println(fruit);
//            if (fruit.equals("Apple")) {
//                list.remove("Apple");  // This won't throw ConcurrentModificationException
//            }
//        }
//
//        System.out.println(list);
    }
}
