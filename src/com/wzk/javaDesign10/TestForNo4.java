package com.wzk.javaDesign10;

import java.util.Scanner;

public class TestForNo4 {
    public static void main(String[] args) {
//        calculateAreaOfPentagon();
//        calculateMaximumCircleDistance();
//        calculateAreaOfTriangle();
//        enterIntegerToShowASCII();
//        enterCharacterToShowASCII();
//        guessBirthday();
//        showTheHexValue();
        hexValueTurnToBinary();
    }

    private static void hexValueTurnToBinary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Hex digit: ");
        String hex = input.nextLine();
        char ch = hex.charAt(0);
        boolean isSmall = ch <= '9';
        int inter = isSmall?(ch - '0'):(ch - 'A' + 10);
        if (hex.length() != 1 || (int) ch < 0 || ch > 'F') {
            System.out.println("bad input");
            System.exit(1);
        }
        //sum变量没有实例化？
        int sum;
        String result = "";
        for (int i = inter; i >= 1; i /= 2) {
            if (i % 2 == 0) {
                sum = 0;
            } else {
                sum = 1;
            }
            //网上找的方法，加反了，怎么把顺序调整过来呢？
            result += sum;
        }
        System.out.println(result);
    }

    private static void showTheHexValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();
        if (number < 0 || number > 15) {
            System.out.println(number + " is an invalid input");
        }
        boolean isSmall = number <= 9;
        char ch = (char) (number + 'A' - 10);
        //下面的方法在输出时当输入值大于9，输出的ch值显示为int型，囧
        //System.out.println("The hex value is " + (isSmall?number:ch));
        String result = "The hex value is ";
        if (isSmall) {
            result += number;
        } else {
            result += ch;
        }
        System.out.println(result);
    }

    private static void guessBirthday() {
        System.out.println("It's your birthday in Set1:\n" +
                "1 2 3 4 5\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Y for Yes and N for No: ");
        String set1 = input.next();
        int sum = 0;
        if (set1.equals("Y")) {
            sum += 1;
        }
        System.out.println("It's your birthday in Set2:\n" +
                "1 2 3 4 5\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10");
        System.out.println("Enter Y for Yes and N for No: ");
        String set2 = input.next();
        if (set2.equals("Y")) {
            sum += 2;
        }
        System.out.println("It's your birthday in Set3:\n" +
                "1 2 3 4 5\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10");
        System.out.println("Enter Y for Yes and N for No: ");
        String set3 = input.next();
        if (set3.equals("Y")) {
            sum += 4;
        }
        System.out.println("It's your birthday in Set4:\n" +
                "1 2 3 4 5\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10");
        System.out.println("Enter Y for Yes and N for No: ");
        String set4 = input.next();
        if (set4.equals("Y")) {
            sum += 8;
        }
        System.out.println("It's your birthday in Set5:\n" +
                "1 2 3 4 5\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10\n" +
                "6 7 8 9 10");
        System.out.println("Enter Y for Yes and N for No: ");
        String set5 = input.next();
        if (set5.equals("Y")) {
            sum += 16;
        }
        System.out.println("You birthday is " + sum + "!");
    }

    private static void enterCharacterToShowASCII() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an character: ");
        //charAt(0)返回字符串指定位置的字符
        char character = input.next().charAt(0);
        System.out.println("The Unicode for the character " + character + " is " + (int)(character));
    }

    private static void enterIntegerToShowASCII() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int code = input.nextInt();
        char charCode = (char)code;
        System.out.println("The character for ASCII code " + code + " is " + charCode);
    }

    private static void calculateAreaOfTriangle() {
        double angle1 = Math.random() * Math.PI * 2;
        double angle2 = Math.random() * Math.PI * 2;
        double angle3 = Math.random() * Math.PI * 2;
        final int r = 40;
        //算出三个点的坐标，分别是（x1,y1）...
        double angle_x1 = r * Math.cos(angle1);
        double angle_y1 = r * Math.sin(angle1);
        double angle_x2 = r * Math.cos(angle2);
        double angle_y2 = r * Math.sin(angle2);
        double angle_x3 = r * Math.cos(angle3);
        double angle_y3 = r * Math.sin(angle3);
        //算出三边长度,(x1,y1)形成的角对应的边设为a，以此类推
        double a = Math.pow(Math.pow(angle_x3 - angle_x2, 2) + Math.pow(angle_y3 - angle_y2, 2), 0.5);
        double b = Math.pow(Math.pow(angle_x3 - angle_x1, 2) + Math.pow(angle_y3 - angle_y1, 2), 0.5);
        double c = Math.pow(Math.pow(angle_x2 - angle_x1, 2) + Math.pow(angle_y2 - angle_y1, 2), 0.5);
        double a_degree = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        double b_degree = Math.acos((-a * a + b * b - c * c) / (-2 * c * a));
        double c_degree = Math.acos((-a * a - b * b + c * c) / (-2 * b * a));
        System.out.printf("三个角的度数分别是%.2f度,%.2f度,%.2f度",Math.toDegrees(a_degree),Math.toDegrees(b_degree),Math.toDegrees(c_degree));
    }

    private static void calculateMaximumCircleDistance() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        String point1 = input.nextLine();
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        String point2 = input.nextLine();
        int segmentation1 = point1.indexOf(',');
        int segmentation2 = point2.indexOf(',');
//        String x1 = point1.substring(0,segmentation);
//        String y1 = point2.substring(segmentation + 1);
//        String x2 = point1.substring(0,segmentation);
//        String y2 = point2.substring(segmentation + 1);
        double x1 = Double.parseDouble(point1.substring(0,segmentation1));
        double y1 = Double.parseDouble(point1.substring(segmentation1 + 1));
        double x2 = Double.parseDouble(point2.substring(0,segmentation2));
        double y2 = Double.parseDouble(point2.substring(segmentation2 + 1));
        final double r = 6371.03;
        double d = r * Math.acos(Math.sin(Math.toRadians(x1))
                                 * Math.sin(Math.toRadians(x2))
                                 + Math.cos(Math.toRadians(x1))
                                 * Math.cos(Math.toRadians(x2))
                                 * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
        System.out.println(d);
        System.out.printf("The distance between the two points is %f km",d);
    }

    private static void calculateAreaOfPentagon() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();
        //计算五边形的边长s
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = 5 * s * s / (4 * Math.tan(Math.PI / 5));
        System.out.println("The area of pentagon is " + (int)(area * 100) / 100.0);
    }
}
