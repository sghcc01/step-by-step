package com.wzk.javaDesign10;

import java.util.Scanner;

/**
 * Created by admin on 2017/5/17.
 */
public class TestForNo2 {
    public static void main(String[] args){
//        turnToFahrenheit();
        areaOfCylinders();面积保留4位小数，体积保留一位小数，四舍五入
    }

    private static void turnToFahrenheit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Celsius temperature: ");
        double temperature = input.nextDouble();
        double Fahrenheit = (9.0 / 5) * temperature + 32;
        System.out.println(temperature + "celsius is " + Fahrenheit + " Fahrenheit");
    }

    private static void areaOfCylinders() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = input.nextDouble();
        System.out.println("Enter the height: ");
        double h = input.nextDouble();
        double area = r * r * Math.PI;
        double volume = area * h;
        System.out.println("area is: " + area);
        System.out.println("volume is: " + volume);
    }
}
