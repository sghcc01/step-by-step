package com.wzk.javaDesign10;

import java.util.Scanner;

public class TestForNo4 {
    public static void main(String[] args) {
//        calculateAreaOfPentagon();
//        calculateMaximumCircleDistance();
        calculateAreaOfTriangle();
    }

    private static void calculateAreaOfTriangle() {
        double angle1 = Math.random() * Math.PI * 2;
        double angle2 = Math.random() * Math.PI * 2;
        double angle3 = Math.random() * Math.PI * 2;
        final int r = 40;
        //算出三个点的坐标，分别是（x1,y1）...
        double angle_x1 = r * Math.cos(angle1);
        double angle_y1 = r * Math.sin(angle1);
        double angle_x2 = r * Math.cos(angle2);
        double angle_y2 = r * Math.sin(angle2);
        double angle_x3 = r * Math.cos(angle3);
        double angle_y3 = r * Math.sin(angle3);
        //算出三边长度,(x1,y1)形成的角对应的边设为a，以此类推
        double a = Math.pow(Math.pow(angle_x3 - angle_x2, 2) + Math.pow(angle_y3 - angle_y2, 2), 0.5);
        double b = Math.pow(Math.pow(angle_x3 - angle_x1, 2) + Math.pow(angle_y3 - angle_y1, 2), 0.5);
        double c = Math.pow(Math.pow(angle_x2 - angle_x1, 2) + Math.pow(angle_y2 - angle_y1, 2), 0.5);
        double a_degree = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        double b_degree = Math.acos((-a * a + b * b - c * c) / (-2 * c * a));
        double c_degree = Math.acos((-a * a - b * b + c * c) / (-2 * b * a));
        System.out.printf("三个角的度数分别是%.2f度,%.2f度,%.2f度",Math.toDegrees(a_degree),Math.toDegrees(b_degree),Math.toDegrees(c_degree));
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
