package com.wzk.javaDesign10;

import java.util.Scanner;

/**
 * Created by admin on 2017/5/27.
 */
public class TestForNo4 {
    public static void main(String[] args) {
        calculateAreaOfPentagon();
    }

    private static void calculateAreaOfPentagon() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();
        //计算五边形的边长s
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = 5 * s * s / (4 * Math.tan(Math.PI / 5));
        System.out.println("The area of pentagon is " + (int)(area * 100) / 100.0);
    }
}
