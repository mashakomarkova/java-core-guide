package org.example.javacollections.arraylistlinkelist;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");

        linkedList.addFirst("C++");
        linkedList.addLast("JavaScript");
        System.out.println(linkedList);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.contains("Java"));
       System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
       System.out.println(linkedList.indexOf("Java"));
       System.out.println(linkedList.size());
        System.out.println(linkedList.remove()); //removes first
        System.out.println(linkedList.removeLast());
    }
}
