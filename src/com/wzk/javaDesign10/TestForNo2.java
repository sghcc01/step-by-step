package com.wzk.javaDesign10;

import java.util.Scanner;

public class TestForNo2 {
    public static void main(String[] args){
//        turnToFahrenheit();
//        areaOfCylinders();
//        feetTurnToMeters();
//        poundsTurnToKilograms();
//        computationalGratuity();
//        sumOfAllNumbers();
//        inputMinuteTurnToYears();
//        showCurrentTime();
//        calculateAverageAcceleration();
//        calculateEnergyForHeatedWater();
//        calculatePrincipalAndInterest();
//         printForm();
        calculateTravelExpenses();
    }

    private static void calculateTravelExpenses() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dirving distance: ");
        double distance = input.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double miles = input.nextDouble();
        System.out.println("Enter price per gallon: ");
        double price = input.nextDouble();
        double travelExpenses = distance / miles * price;
        System.out.println("The cast of dirver is $" + (int)(travelExpenses * 100) / 100.0);
    }

    private static void printForm() {
        System.out.print("a\t");
        System.out.print("b\t");
        System.out.print("pow(a, b)");
        System.out.println();
        for (int i = 1; i < 6; i++) {
            int j = i + 1;
            System.out.print(i + "\t");
            System.out.print(j + "\t");
            System.out.print((int)(Math.pow(i,j)));
            System.out.println();
        }
    }

    private static void calculatePrincipalAndInterest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double amountOfMonthly = input.nextDouble();
        double firstMonthlyOfAmount = amountOfMonthly * (1 + 0.00417);
        double secondMonthlyOfAmount = (amountOfMonthly + firstMonthlyOfAmount) * (1 + 0.00417);
        double threadMonthlyOfAmount = (amountOfMonthly + secondMonthlyOfAmount) * (1 + 0.00417);
        double fourMonthlyOfAmount = (amountOfMonthly + threadMonthlyOfAmount) * (1 + 0.00417);
        double fiveMonthlyOfAmount = (amountOfMonthly + fourMonthlyOfAmount) * (1 + 0.00417);
        double sixMonthlyOfAmount = (amountOfMonthly + fiveMonthlyOfAmount) * (1 + 0.00417);
        System.out.println("After the sixth month,the account value is $" + (int)(sixMonthlyOfAmount * 100) / 100.0);
    }

    private static void calculateEnergyForHeatedWater() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilogram: ");
        double amountOfWater = input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        double culateEnergy = (finalTemperature - initialTemperature) * amountOfWater * 4184;
        System.out.println("The energy needed is " + culateEnergy);
    }

    private static void calculateAverageAcceleration() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0、v1 and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println("The average acceleration is " + a);
    }

    private static void showCurrentTime() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int timeZone = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60 + timeZone;
        long currentHours = totalHours % 24;
        System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSecond);
    }

    /*( 求出年教 ） 编写程序 ， 提示用户输入分钟数 （ 例如十亿 ） 然后显示这些分钟代表多少年和多少天 。
        为了简化问题 ， 假设一年有 365 天
    */
    private static void inputMinuteTurnToYears() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();
        int days = minutes / (60 * 24);
        int years = days / 365;
        int leftDays = days % 365;
        System.out.println(minutes + "minutes is approximately " + years + " years and " + leftDays + " days");
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
