package com.wzk.javaDesign10;

import java.util.Scanner;

/**
 * Created by admin on 2017/5/27.
 */
public class TestForNo4 {
    public static void main(String[] args) {
//        calculateAreaOfPentagon();
        calculateMaximumCircleDistance();
    }

    private static void calculateMaximumCircleDistance() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        String point1 = input.nextLine();
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        String point2 = input.nextLine();
        int segmentation1 = point1.indexOf(',');
        int segmentation2 = point2.indexOf(',');
//        String x1 = point1.substring(0,segmentation);
//        String y1 = point2.substring(segmentation + 1);
//        String x2 = point1.substring(0,segmentation);
//        String y2 = point2.substring(segmentation + 1);
        double x1 = Double.parseDouble(point1.substring(0,segmentation1));
        double y1 = Double.parseDouble(point1.substring(segmentation1 + 1));
        double x2 = Double.parseDouble(point2.substring(0,segmentation2));
        double y2 = Double.parseDouble(point2.substring(segmentation2 + 1));
        final double r = 6371.03;
        double d = r * Math.acos(Math.sin(Math.toRadians(x1))
                                 * Math.sin(Math.toRadians(x2))
                                 + Math.cos(Math.toRadians(x1))
                                 * Math.cos(Math.toRadians(x2))
                                 * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
        System.out.println(d);
        System.out.printf("The distance between the two points is %f km",d);
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
