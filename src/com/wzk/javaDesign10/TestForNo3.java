package com.wzk.javaDesign10;

import java.util.Scanner;

/**
 * Created by admin on 2017/5/22.
 */
public class TestForNo3 {
    public static void main(String args[]) {
//        practiceSubtraction();
//        ConputeAndInterpretBMI();
//        ChineseZodiac();
//        whichDay();
//        test3_31();
//        solvingEquations();
//        showMonth();
        showWhichDay();
    }

    private static void showWhichDay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int days = input.nextInt();
        String todayName = convertDays(days);
        int someday = today + days % 7;
        String somedayName = convertDays(someday);
        System.out.println("Today is " + todayName + " and the future day is " + somedayName);
    }

    private static String convertDays(int day) {
        switch (day) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "";
        }
    }

    private static void showMonth() {
        //monthTest变量中的随机数应该是正确的取法；
        // month变量中随机数是根据时间变化的，不能算作是实际意义上的随机数。
        int month = (int)(System.currentTimeMillis() % 12) + 1;
        int monthTest = (int)(Math.random() * 12 + 1);
        switch (monthTest) {
            case 1: System.out.println("January");break;
            case 2: System.out.println("February");break;
            case 3: System.out.println("March");break;
            case 4: System.out.println("April");break;
            case 5: System.out.println("May");break;
            case 6: System.out.println("June");break;
            case 7: System.out.println("July");break;
            case 8: System.out.println("August");break;
            case 9: System.out.println("September");break;
            case 10: System.out.println("October");break;
            case 11: System.out.println("November");break;
            case 12: System.out.println("December");
        }
    }

    private static void solvingEquations() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        final double discriminant = Math.pow(b,2) - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.pow(discriminant, 0.5)) / 2 / a;
            double x2 = (-b - Math.pow(discriminant,0.5)) / 2 / a;
            System.out.println("The equation has two roots " + x1 +" and " + x2);
        }else if (discriminant == 0) {
            double x = -b / 2 / a;
            System.out.println("The equation has one root " + x);
        } else {
            System.out.println("The equation has no real roots");
        }
    }

    private static void test3_31() {
        int x = 1,a= 3;
        switch (a) {
            case 1: x += 5;break;
            case 2: x += 10;break;
            case 3: x += 16;break;
            case 4: x += 34;break;
        }
        System.out.println(x);
    }

    private static void whichDay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day that will tell you it is weekday or weekend：");
        int day = input.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Weekday");break;
            case 0:
            case 6: System.out.println("Weekend");
        }
    }

    private static void ChineseZodiac() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        switch (year % 12) {
            case 0: System.out.println("monkey");break;
            case 1: System.out.println("rooster");break;
            case 2: System.out.println("dog");break;
            case 3: System.out.println("pig");break;
            case 4: System.out.println("rat");break;
            case 5: System.out.println("ox");break;
            case 6: System.out.println("tiger");break;
            case 7: System.out.println("rabbit");break;
            case 8: System.out.println("dragon");break;
            case 9: System.out.println("snake");break;
            case 10: System.out.println("horse");break;
            case 11: System.out.println("sheep");
        }
}

    private static void ConputeAndInterpretBMI() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCHES = 0.0254;
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCHES;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight" + " 尼玛，太瘦了");
        }else if (bmi < 25) {
            System.out.println("Normal" + "！！！告诉你，正常的人没有几个的");
        }else if (bmi < 30) {
            System.out.println("Overweight" + " 欢迎你进入超重圈，嘎嘎");
        }else
            System.out.println("Obese" + " 大哥，一路走好");
    }

    private static void practiceSubtraction() {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        double number3 = Math.random();
        System.out.println(number3);
        if (number1 < number2) {
            int number = number1;
            number1 = number2;
            number2 = number;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("what is " + number1 + " - " + number2 + "?");
        boolean result = number1 - number2 == input.nextInt();
        System.out.println("It is " + result);
    }

}
