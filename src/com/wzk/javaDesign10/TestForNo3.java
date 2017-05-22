package com.wzk.javaDesign10;

import java.util.Scanner;

/**
 * Created by admin on 2017/5/22.
 */
public class TestForNo3 {
    public static void main(String args[]) {
        practiceSubtraction();
    }

    private static void practiceSubtraction() {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
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
