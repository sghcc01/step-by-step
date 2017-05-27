package com.wzk.javaDesign10;

import com.wzk.Main;

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
//        guessPositiveOrNegative();
//        lottery();
//        showRandomCoordinates();
//        guessingGame();
//        showTransportationCost();
//        calculateTriangularCircumference();
//        tellYouWhetherInTheCircle();//检査这个点是否在以原点（0, 0) 为圆心、半径为 10 的圆内
//        tellYouWetherInTheRectangle();//检测该点是否在以原点（0,0)为中心、宽为 10、 高为 5 的矩形中
//        chooseAPokerCard();//(游戏：挑一张牌）编写程序，模拟从一副S2张的牌中选择一张牌。程序应该显示牌的大小(Ace、2、3、4、5、6、7、8、9、10、Jack、Queen、King)以及牌的花色（Clubs(黑梅花)、Diamonds(红方块）、Hearts(红心）、Spades(黑桃））。下面是这个程序的运行示例：
//        showDivisible();//提示用户输入一个整数值，然后判定它是否能被 5 和6 整除，是否能被 5 或 6 整除，以及是否能被 5 或 6 整除但是不能同时被它们整除
//        tellYouWhetherInTheTriangle();//假设一个直角三角形放在一个平面上，y= -x / 2 + 100;直角点在（0,0) 处，其他两个点分别在（ 200, 0 ) 和（ 0, 100 ) 处。编写程序，提示用户输人一个点的；c 坐标和7坐标，然后判定这个点是否在该三角形内
        exchangeRateConversion();

    }

    private static void exchangeRateConversion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int status = input.nextInt();
        //待优化，当status值不为0或者1时，需要输出incurrent input，并且退出运行程序
        if (status != 0 || status != 1) {
        }
        System.out.println("Enter the " + (statusment(status) ? "RMB" : "dollar") + " amount: ");
        double amount = input.nextDouble();
        switch (status) {
            case 0:
                System.out.println("$" + amount + " is " + amount * exchangeRate + " yuan");
            //此处转换时使用了去尾，实际上应该是四舍五入
            case 1:
                System.out.println(amount + " yuan is $" + (int)(amount / exchangeRate * 100) / 100.0);
        }
    }

    private static boolean statusment(int status) {
        switch (status) {
            case 0:return false;
            default:return true;
        }
    }

    private static void tellYouWhetherInTheTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x >= 0 && y >= 0 && y + x / 2 <= 100) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }

    private static void showDivisible() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        boolean isDivisible_5 = number % 5 == 0;
        boolean isDivisible_6 = number % 6 == 0;
        System.out.println("Is " + number + "divisible by 5 and 6? " + (isDivisible_5 && isDivisible_6));
        System.out.println("Is " + number + "divisible by 5 or 6? " + (isDivisible_5 || isDivisible_6));
        System.out.println("Is " + number + "divisible by 5 or 6, but not both? " + (isDivisible_5 ^ isDivisible_6));
    }

    private static void chooseAPokerCard() {
        int number = (int)(Math.random() * 13) + 1;
        int colorOfCard = (int) (Math.random() * 4) + 1;
        System.out.println("The card you picked is " + changeNumber(number) + " of " + changeColor(colorOfCard));
    }

    private static String changeColor(int colorOfCard) {
        switch (colorOfCard) {
            case 1:return "Clubs";
            case 2:return "Diamonds";
            case 3:return "Hearts";
            case 4:return "Spades";
            default: return null;
        }
    }

    private static String changeNumber(int number) {
        switch (number) {
            case 1: return "Ace";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default:return null;
        }
    }

    private static void tellYouWetherInTheRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (Math.pow(x * x,0.5) <= 5 && Math.pow(y * y,0.5) <=2.5) {
            System.out.println("Point (" + x + "," + y +")" + " is in the rectangle");
        } else {
            System.out.println("Point (" + x + "," + y +")" + " is not in the rectangle");
        }
    }

    private static void tellYouWhetherInTheCircle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double length_x_y = Math.pow(x * x + y * y, 0.5);
        if (length_x_y > 10) {
            System.out.println("Point (" + x + "," + y +")" + " is not in the circle");
        } else if (length_x_y <= 10) {
            System.out.println("Point (" + x + "," + y +")" + " is in the circle");
        }
    }

    private static void calculateTriangularCircumference() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the three sides: ");
        double sides1 = input.nextDouble();
        double sides2 = input.nextDouble();
        double sides3 = input.nextDouble();
        double perimeter = sides1 + sides2 + sides3;
        if (sides1 + sides2 > sides3
                && sides1 + sides3 > sides2
                && sides2 + sides3 > sides1) {
            System.out.println("Perimeter is " + perimeter);
        }else System.out.println("The input value is not legal");
    }

    private static void showTransportationCost() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the package weight: ");
        double weight = input.nextDouble();
        if (weight > 0 && weight <= 1) {
            System.out.println("The transportation cost is $3.5");
        }else if (weight > 1 && weight <= 3) {
            System.out.println("The transportation cost is $5.5");
        }else if (weight > 3 && weight <= 10) {
            System.out.println("The transportation cost is $8.5");
        }else if (weight > 10 && weight <= 20) {
            System.out.println("The transportation cost is $10.5");
        }else
            System.out.println("The package cannot be shipped");
    }

    private static void guessingGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("scissor(0), rock(1), paper(2): ");
        int computerResult = (int)(Math.random() * 3);
        int yourResult = input.nextInt();
        if (computerResult == yourResult) {
            System.out.println("The computer is " + result(computerResult) + ". You are " + result(yourResult)
            + " too. It's a draw.");
        } else if (computerResult == 0) {
            switch (yourResult) {
                case 1:
                    System.out.println("The computer is " + result(computerResult) + ". You are " + result(yourResult)
                            + ". You won.");break;
                case 2:
                    System.out.println("The computer is " + result(computerResult) + ". You are " + result(yourResult)
                            + ". Computer won.");break;
            }
        } else if (computerResult == 1) {
            switch (yourResult) {
                case 2:
                    System.out.println("The computer is " + result(computerResult) + ". You are " + result(yourResult)
                            + ". You won.");break;
                case 0:
                    System.out.println("The computer is " + result(computerResult) + ". You are " + result(yourResult)
                            + ". Computer won.");break;
            }
        } else if (computerResult == 2) {
            switch (yourResult) {
                case 0:
                    System.out.println("The computer is " + result(computerResult) + ". You are " + result(yourResult)
                            + ". You won.");break;
                case 1:
                    System.out.println("The computer is " + result(computerResult) + ". You are " + result(yourResult)
                            + ". Computer won.");break;
            }
        }
    }

    private static String result(int result) {
        switch (result) {
            case 0: return "scissor";
            case 1: return "rock";
            case 2: return "paper";
            default: return "";
        }
    }

    private static void showRandomCoordinates() {
        int randomCoordinates_x = (int)(Math.random() * 101) - 50;
        int randomCoordinates_y = (int)(Math.random() * 201) - 100;
        System.out.println("The random point coordinates is " + "("
                + randomCoordinates_x + "," + randomCoordinates_y + ")");
    }

    private static void lottery() {
        int lottery = (int) (Math.random() * 1000);
        System.out.println(lottery);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick(three digits): ");
        int guess = input.nextInt();
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery % 100) / 10;
        int lotteryDigit3 = (lottery % 100) % 10;
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = (guess % 100) % 10;
        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        }else if (lotteryDigit1 == guessDigit1
                && lotteryDigit2 == guessDigit3
                && lotteryDigit3 == guessDigit2
                || lotteryDigit1 == guessDigit2
                && (lotteryDigit2 == guessDigit1
                && lotteryDigit3 == guessDigit3
                || lotteryDigit2 == guessDigit3
                && lotteryDigit3 == guessDigit2
                || lotteryDigit1 == guessDigit3
                && (lotteryDigit2 == guessDigit1
                && lotteryDigit3 == guessDigit2
                || lotteryDigit2 == guessDigit2
                && lotteryDigit3 == guessDigit1))) {
            System.out.println("Match all digits: you win $3,000");
        }else if (lotteryDigit1 == guessDigit1
                || lotteryDigit1 == guessDigit2
                || lotteryDigit1 == guessDigit3
                || lotteryDigit2 == guessDigit1
                || lotteryDigit2 == guessDigit2
                || lotteryDigit2 == guessDigit3
                || lotteryDigit3 == guessDigit1
                || lotteryDigit3 == guessDigit2
                || lotteryDigit3 == guessDigit3) {
            System.out.println("Match one digit: you win $1,000. the lottery is " + lottery);
        } else {
            System.out.println("Sorry,no match. the lottery is " + lottery);
        }
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
