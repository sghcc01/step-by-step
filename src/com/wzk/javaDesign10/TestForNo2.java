package com.wzk.javaDesign10;

import java.util.Scanner;

/**
 * Created by admin on 2017/5/17.
 */
public class TestForNo2 {
    public static void main(String[] args){
//        turnToFahrenheit();
//        areaOfCylinders();
//        feetTurnToMeters();
//        poundsTurnToKilograms();
//        computationalGratuity();
        sumOfAllNumbers();
    }
/*
 ( 求一个整數各位數的和 ） 编写程序 ， 读取一个在 0 和 1000 之间的整数 ， 并将该整数的各位数字
相加 。 例如 ： 整数是 932 , 各位数字之和为 14 。
提示 ： 利用操作符 X 分解数字 ， 然后使用操作符 / 去掉分解出来的數字 。 例如 ： 932 X 10 — 2 ,
932 / 10 = 930
 */
    private static void sumOfAllNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int theNumberOfBits = number % 10;
        int newNumber = number / 10;
        int theNumberOfTenPlaces = newNumber % 10;
        int newNumber2 = newNumber / 10;
        int theNumberOfHundred = newNumber2 % 10;
        int sum = theNumberOfBits + theNumberOfTenPlaces + theNumberOfHundred;
        System.out.println("各位数的总和是： " + sum);
    }

    private static void computationalGratuity() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }

    private static void poundsTurnToKilograms() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
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
