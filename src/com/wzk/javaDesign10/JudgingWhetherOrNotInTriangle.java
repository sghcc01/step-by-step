package com.wzk.javaDesign10;

import java.util.Scanner;

public class JudgingWhetherOrNotInTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.print("The point is ");
        System.out.print((x + 2 * y >= 0 && x + 2 * y <= 200) ? "" : "not " );
        System.out.print("in the triangle");
    }
}