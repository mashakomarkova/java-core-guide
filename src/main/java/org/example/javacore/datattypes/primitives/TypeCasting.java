package org.example.javacore.datattypes.primitives;

public class TypeCasting {

    public static void main(String[] args) {
//        int myInt = 100;
//        double myDouble = myInt;

        double myDouble = 100.5;
        int myInt = (int) myDouble;
        System.out.println("Integer" + myInt);
        System.out.println("Double" + myDouble);

//        boolean b = true;
//        int i = b;

        int largeInt = 130;
        byte smallByte = (byte) largeInt;
        System.out.println(largeInt);
        System.out.println(smallByte);//value is lost

        char a = 'A'+1; //A=65, B=66, 0=48
        int number = a;
        System.out.println(number);
        System.out.println(a);

        byte b = (byte) a;

    }
}
