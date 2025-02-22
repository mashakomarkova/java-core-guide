package org.example.javacore.generics;

public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        // Create a Box to hold Integer
        Box<Integer> intBox = new Box<>();
        intBox.setContent(123);
        System.out.println("Integer Box content: " + intBox.getContent());

        // Create a Box to hold String
        Box<String> strBox = new Box<>();
        strBox.setContent("Hello");
        System.out.println("String Box content: " + strBox.getContent());
    }
}
