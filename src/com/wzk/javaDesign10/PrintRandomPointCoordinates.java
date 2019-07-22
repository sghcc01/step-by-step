package com.wzk.javaDesign10;

public class PrintRandomPointCoordinates {
    public static void main (String[] args){
        int x = (int)(Math.random() * 101) - 50;
        int y = (int)(Math.random() * 201) - 100;
        System.out.println("The random point in rectangle is (" + x + "," + y + ")");
    }
}
