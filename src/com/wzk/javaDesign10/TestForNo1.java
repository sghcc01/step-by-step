package com.wzk.javaDesign10;

import java.util.Scanner;

public class TestForNo1 {
    public static void main(String[] args) {
//        System.out.println((9 / 5) * 35 + 32);//其中 （9 / 5）程序认为1，整数相除返回除法的整数部分
//        System.out.println((9.0 / 5) * 35 + 32);

//        computeAreaWithConsoleInput();
//        Test1();
//        secondsToMinntes();
//        Test3();
//        showCurrentTime();
        test();
    }

    private static void test() {
        double a = 10.03 * 100;
        int b = (int)a;
        System.out.println(b);
    }

    private static void showCurrentTime() {
        long currentTime = System.currentTimeMillis();
        long totalSeconds = currentTime / 1000;
        long curentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println(currentHour + "时" + currentMinute + "分" + curentSecond + "秒");

    }

    private static void Test3() {
        double a =(double) 25/4;
        System.out.println(a);
        System.out.println ( "3.0 * 2 / 4 :" + 3.0* 2 / 4 );
        System.out.println(Math.pow(2,3.5));
        System.out.println(1111);
        long ssn = 1223334;
        System.out.println("long ssn is " + ssn);
    }

    private static void secondsToMinntes() {
        Scanner input = new Scanner(System.in);
        System.out.print("input seconds: ");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int leaveMinutes = minutes % 60;
        int remains = seconds % 60;
        System.out.println(hours+"小时"+leaveMinutes+"分"+remains+"秒");
    }
    private static void Test1() {
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println(kilometers);
    }

    private static void Test2() {
        int a = (2 + 100) % 7;
        System.out.println(a);
    }

    private static void computeAreaWithConsoleInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入半径值：");
        double radius = input.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("area is " + formatDouble5(area));
    }

    private static void testPeopleOfAmerican(int n) {
        int basePeople = 312032486;
        int people1 = basePeople;
        long T = 90;//365 * n * 24 * 60 * 60;

       long people = basePeople + (T / 7) - (T / 13) + (T / 45);
        int sum = 0;
        for (long i = 1; i <= T; i++) {
            if (i % 7 == 0) {
                people1 = people1 + 1;
            }
            if (i % 45 == 0) {
                people1 = people1 + 1;
            }
            if (i % 13 == 0) {
                people1 = people1 - 1;
            }
        }
        System.out.println(n+"年后总人口是:"+people1);
        System.out.println("for中的13的次数" + sum);
        System.out.println("T/13的值为" + (T / 13));
        System.out.println(n+"年后总人口是(第二种方法):"+people);
    }

    private static void testSpeed(double M,double S,double l) {
        double T = M/60 + S/60/60;
        double L = l/1.6;
        double SS = L/T;
        System.out.println("当前的平均速度是：" + formatDouble5(SS) +" 英里/小时");
    }

    private static String formatDouble5(double d) {
        return String.format("%.2f", d);
    }

    private static void testPrintGS() {
        double a = 9.5 * 4.5 - 2.5 * 3;
        double b = 45.5 - 3.5;
        System.out.print(a/b);
    }

    private static void testSC(double r) {
        double S = r * r * Math.PI;
        double C = r * 2 * Math.PI;
        System.out.println(Math.PI);
        System.out.println("面积是：" + S);
        System.out.println("周长是：" + C);
    }

    private static void testGS() {
        double sum = 0;
        for (int i =1; i <= 13; i = i + 4) {
            sum = (double)1/i + sum;
        }
        for (int i =3; i <= 13; i = i + 4) {
            sum = sum - (double)1/i ;
        }
        System.out.print(4 * sum);
    }
    private static void testSum() {
        int sum = 0;
        for (int i =1; i <= 9; i++) {
            sum = sum + i;
        }
        System.out.print(sum);
    }

    private static void testPrintJAVA() {
        for (int i = 1; i <= 4; i++) {
            printJ(i);
            System.out.print("    ");
            printA(i);
            System.out.print("    ");
            printV(i);
            System.out.print("    ");
            printA(i);

            System.out.println();
        }
    }

    private static void printJ(int i) {
        if (i == 3) {
            System.out.print("J   J");
        }else if (i == 4) {
            System.out.print(" J J ");
        } else {
            System.out.print("    J");
        }
    }

    private static void printA(int i) {
        if (i == 1) {
            System.out.print("   A   ");
        }else if (i == 2) {
            System.out.print("  A A  ");
        }else if (i == 3) {
            System.out.print(" AAAAA ");
        }else if (i == 4) {
            System.out.print("A     A");
        }
    }

    private static void printV(int i) {
        if (i == 1) {
            System.out.print("V     V");
        }else if (i == 2) {
            System.out.print(" V   V ");
        }else if (i == 3) {
            System.out.print("  V V  ");
        }else if (i == 4) {
            System.out.print("   V   ");
        }
    }
}
