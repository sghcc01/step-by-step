package com.wzk.javaDesign10;

import java.util.Scanner;

public class PrintTheNumberOfDaysInThatMonth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of month and particular year: ");
        int mouth = input.nextInt();
        int year = input.nextInt();
        String reminningMouth = "";
        switch (mouth) {
            case 1 : reminningMouth = "January";break;
            case 2 : reminningMouth = "February";break;
            case 3 : reminningMouth = "March";break;
            case 4 : reminningMouth = "April";break;
            case 5 : reminningMouth = "May";break;
            case 6 : reminningMouth = "June";break;
            case 7 : reminningMouth = "July";break;
            case 8 : reminningMouth = "August";break;
            case 9 : reminningMouth = "September";break;
            case 10 : reminningMouth = "October";break;
            case 11 : reminningMouth = "November";break;
            case 12 : reminningMouth = "December";break;
        }
        switch (mouth) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 : System.out.println(reminningMouth + " " + year + " have 31 days"); break;
            case 4 :
            case 6 :
            case 9 :
            case 11 : System.out.println(reminningMouth + " " + year + " have 30 days"); break;
            case 2 : System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ?
                    reminningMouth + " " +  year + " have 29 days" :
                    reminningMouth + " " + year + " have 28 days");break;
            default: System.out.println("No such mouth!");System.exit(1);
        }
    }
}
