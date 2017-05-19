package com.wzk.javaDesign10;

import java.util.Scanner;

/**
 * Created by admin on 2017/5/17.
 */
public class TestForNo2 {
    public static void main(String[] args){
//        turnToFahrenheit();
//        areaOfCylinders();
        feetTurnToMeters();
    }

    private static void feetTurnToMeters() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet:");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");
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
