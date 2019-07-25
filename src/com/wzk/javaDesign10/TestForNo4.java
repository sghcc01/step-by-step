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
//        hexValueTurnToBinary();
//        convertLettersToNumbers();
//        showRandomUppercaseLetter();
//        showHowManyDays();
//        showLenghtAndFirstCharacter();
//        checkSSN();
//        exercise04_22();
//        exercise04_23();
//        exercise04_01();
//        exercise04_16();
//          exercise04_24();
        hexValueTurnToBinary();
    }
    private static void exercise04_24() {
        int random = 65 + (int) (Math.random() * 26);
        System.out.println((char) random);
    }
    private static void exercise04_16() {
        int random = 65 + (int) (Math.random() * 26);
        System.out.println((char) random);
    }
    private static void exercise04_01() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();
        //计算边长s
        double s = 2 * r * Math.sin(Math.PI / 5);
        //计算面积
        double v = 5 * s * s / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f\n", v);
    }

    private static void exercise04_23() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String name = input.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        double grossRate = payRate * hours;
        System.out.printf(
                "Employee Name: %s\n" +
                "Hours Worked: %.1f\n" +
                "Pay Rate: $%.2f\n" +
                "Gross Pay: $%.1f\n" +
                "Deductions:\n" +
                "  Federal Withholding (20.0%%):$%.1f\n" +
                "  State Withholding (9.0%%): $%.2f\n" +
                "  Total Deduction: $%.2f\n" +
                "Net Pay: $%.2f",
                name,
                hours,
                payRate,
                grossRate,
                grossRate * federalTax,
                grossRate * stateTax,
                grossRate * federalTax + grossRate * stateTax,
                grossRate - grossRate * federalTax - grossRate * stateTax);
    }

    private static void exercise04_22() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.println("Enter string s2: ");
        String s2 = input.nextLine();
//        if (s1.indexOf(s2) != -1) {
//            System.out.println(s2 + " is a substring of " + s1);
//        } else {
//            System.out.println(s2 + " is not a substring of " + s1);
//        }
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }

    private static void checkSSN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String ssn = input.nextLine();
        if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
            String str1 = ssn.substring(0, 3);
            String str2 = ssn.substring(4, 6);
            String str3 = ssn.substring(7);
            String str = str1 + str2 + str3;
            for (int i = str.length(); i > 0; i--) {
                boolean right = Character.isDigit(str.charAt(i - 1));
                if (!right) {
                    System.out.println(ssn + " is an invalid social security number");
                    System.exit(0);
                }
            }
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }

    private static void showLenghtAndFirstCharacter() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string:");
        String numbers=input.nextLine();
        int l=numbers.length();
        char ch=numbers.charAt(0);
        System.out.println("length :"+l);
        System.out.println("first character :"+ch);
    }

    private static void showHowManyDays() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter a mouth: ");
        //在此处我使用input.nextLine()方法后，无法输入mouth，直接显示了结果,不清楚原因
        String mouth = input.next();
        boolean is31days =
                           mouth.equals("Jan")
                        || mouth.equals("Mar")
                        || mouth.equals("May")
                        || mouth.equals("Jul")
                        || mouth.equals("Aug")
                        || mouth.equals("Oct")
                        || mouth.equals("Dec");
        if (mouth.equals("Feb")) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(mouth + " " + year + " has 29 days");
            } else {
                System.out.println(mouth + " " + year + " has 28 days");
            }
        } else {
            System.out.println(mouth + " " + year + " has " + (is31days ? 31 : 30)+" days");
        }
    }

    private static void showRandomUppercaseLetter() {
        int number = 'A' + (int)(Math.random() * 26);
//        int和char不能相加，但是'A'+1 可以？
//        char ch = 'A' + number;
        System.out.println("Random letter is " + (char)number);
    }

    private static void convertLettersToNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        char ch = Character.toUpperCase(input.next().charAt(0));
        if (ch < 'A' || ch > 'F' || ch == 'E') {
            System.out.println(ch + " is a invalid input");
            System.exit(1);
        }
        int number = Math.abs(ch - 'A' - 4);
        if (ch != 'F') {
            System.out.println("The numeric value for grade is " + ch + " is " + number);
        } else {
            System.out.println("The numeric value for grade is " + ch + " is 0");
        }
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
            //已经调整过来了，之前使用的 result += sum 方法。把它改为如下表达式就可以了
            //result = sum + result;
            result = ("" + sum).concat(result);
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
