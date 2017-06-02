package com.wzk.javaDesign10;

import java.util.Scanner;

public class TestForNo5 {
    public static void main(String[] args) {
//        testBreak();
//        testContinue();
//        testBreakOrContinue();
//        printFiftyPrimeNumber();
        statisticalData();
    }

    private static void statisticalData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends of if it is 0: ");
        int num = input.nextInt();
        int numberPositives = 0, numberNegatives = 0,total = 0,count = 0;
        while (num != 0) {
            if (num > 0) {
                numberPositives++;
            } else {
                numberNegatives++;
            }
            total += num;
            count++;
            num = input.nextInt();
        }
        if (count == 0) {
            System.out.println("No number are entered except 0");
        } else {
            System.out.println("The number of positives is " + numberPositives);
            System.out.println("The number of negatives is " + numberNegatives);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f", (double) total / count);
        }

    }

    private static void printFiftyPrimeNumber() {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;
        System.out.println("The first 50 prime numbers are \n");
        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                }
                else {
                    System.out.printf("%-6d",number);
                }
            }
            number++;
        }
    }

    private static void testBreakOrContinue() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2) {
                    continue;
                }
                System.out.println(i * j);
            }
            System.out.println(i);
        }
    }

    private static void testContinue() {
        int number = 0;
        int sum = 0;
        while (number < 20) {
            number++;
            if (!(number == 10 || number == 11)) {
                sum += number;
            }
        }
        System.out.println("number is " + number);
        System.out.println("sum is " + sum);
    }

    private static void testBreak() {
        int number = 0;
        int sum = 0;
        while (number < 20 && sum < 100) {
            number++;
            sum += number;
        }
        System.out.println("number is " + number);
        System.out.println("sum is " + sum);
    }
}
