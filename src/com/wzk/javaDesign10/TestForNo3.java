package com.wzk.javaDesign10;

import java.util.Scanner;

/**
 * Created by admin on 2017/5/22.
 */
public class TestForNo3 {
    public static void main(String args[]) {
//        practiceSubtraction();
//        ConputeAndInterpretBMI();
        ChineseZodiac();
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
