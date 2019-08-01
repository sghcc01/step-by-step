package com.wzk.javaDesign10;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TestForNo5 {
    public static void main(String[] x) {
//        testBreak();
//        testContinue();
//        testBreakOrContinue();
//        printFiftyPrimeNumber();
//        statisticalData();
//        additionQuizLoop();
//        isPrime(77);
//        reverse();
//        test();
        exercise05_01();
    }
    private static void exercise05_01() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer,the input ends if it is 0: ");
        int positivesNum = 0;
        int negativesNum = 0;
        int totalNum = 0;
        int averageNum = 0;
        int count = 0;
        int num = input.nextInt();
        if (num != 0) {
            while (num != 0) {
                if (num > 0) {
                    positivesNum++;
                }else negativesNum++;
                totalNum += num;
                count++;
                num = input.nextInt();
            }
            System.out.printf("The number of positives is %d\nThe number of negatives is %d\nThe total is %.1f\nThe average is %.2f",positivesNum,negativesNum,(double)totalNum,(double)totalNum / count);
        } else
            System.out.println("No numbers are entered except 0");
    }

    private static void test() {
        int[] list = {1, 2, 3, 4, 5};
        java.util.Arrays.fill(list,8);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println(java.util.Arrays.toString(list));
    }

    private static void reverse(int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[list.length - 1 - i];
        }
        for (int i = 0; i < list.length; i++) {
            list[i] = newList[i];
        }
    }

//    private static void reverse() {
//        int[] list = {1, 2, 3, 4, 5};
//        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
//            int temp = list[i];
//            list[j] = list[i];
//            list[i] = temp;
//        }
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i]);
//        }
//    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    private static void additionQuizLoop() {
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
