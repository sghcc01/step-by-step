package com.wzk.javaDesign10;

import java.util.Scanner;

public class TestForNo3 {
    public static void main(String args[]) {
//        practiceSubtraction();
//        ConputeAndInterpretBMI();
//        ChineseZodiac();
//        whichDay();
//        test3_31();
//        solvingEquations();
//        showMonth();
//        showWhichDay();
//        showNumberNotDesc();
//        printISBN10();
//        showHowManyDaysEachMonth();
//        verificationPalindrome();
        guessPositiveOrNegative();
    }

    private static void guessPositiveOrNegative() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you guess: ");
        int guessResult = input.nextInt();
        int result = (int)(Math.random() * 2);
        if (guessResult == result) {
            System.out.println("It's current!");
        } else {
            System.out.println("It's wrong. result is " + result);
        }
    }

    private static void verificationPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int digit = input.nextInt();
        int first_digit = digit % 10;
        final int three_digit = (digit / 100);
        if (first_digit == three_digit) {
            System.out.println(digit + " is a palindrome");
        } else {
            System.out.println(digit + " is not a palindrome");
        }
    }

    private static void showHowManyDaysEachMonth() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month and years: ");
        int month = input.nextInt();
        int years = input.nextInt();
        final boolean isLeapYear = years % 4 == 0 && years % 100 != 0 || years % 400 == 0;
        if (month == 2 && isLeapYear) {
            System.out.println(monthName(month) + " " + years + " has 28 days");
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: System.out.println(monthName(month) + " " + years + " has 31 days");break;
                case 2: System.out.println(monthName(month) + " " + years + " has 29 days");break;
                default: System.out.println(monthName(month) + " " + years + " has 30 days");
            }
        }
    }

    private static String monthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }

    private static void printISBN10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first nine number: ");
        int first = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        int four = input.nextInt();
        int five = input.nextInt();
        int six = input.nextInt();
        int seven = input.nextInt();
        int eight = input.nextInt();
        int nine = input.nextInt();
        int ten = ( first * 1 + two * 2 + three * 3 + four * 4 + five * 5
                    + six * 6 + seven * 7 + eight * 8 + nine * 9) % 11;
        switch (ten) {
            case 10:System.out.println(first + "" + two + "" + three
                    + "" + four + "" + five + "" + six + "" + seven
                    + "" + eight + "" + nine + "X");break;
            default:System.out.println(first + "" + two + "" + three
                    + "" + four + "" + five + "" + six + "" + seven
                    + "" + eight + "" + nine + "" + ten);
        }
    }

    private static void showNumberNotDesc() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a >= b && b >= c) {
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a + " " + b + " " + c);
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
