package org.example.javacollections.arraylistlinkelist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println(arrayList);

        arrayList.add(1, "C#");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.remove("C++"));
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("Python"));
        System.out.println(arrayList.contains("Python"));
        System.out.println(arrayList.size());
    }
}
