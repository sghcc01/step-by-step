package com.wzk.javaDesign10;

import java.util.Scanner;

public class TestForNo7 {
    public static void main(String[] args) {
        exercise7_1();
    }

    private static void exercise7_1() {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        System.out.print("Enter " + numbers + " scores: ");
        double[] scores = new double[numbers];
        for (int i = 0; i < numbers; i++) {
            scores[i] = input.nextDouble();
        }
        double bestScore = getBestScore(scores);
        char[] grade = getGrade(scores,bestScore);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i]+ " and grade is " + grade[i]);
        }
    }

    private static char[] getGrade(double[] scores, double bestScore) {
        char[] grade = new char[scores.length];
        for (int i = 0; i < scores.length; i++) {
            grade[i] = (char)(Math.abs(bestScore - scores[i] - 1) / 10 + 'A');
            grade[i] = grade[i] > 'F' ? 'F' : grade[i];
        }
        return grade;
    }

    private static double getBestScore(double[] scores) {
        double bestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            bestScore = scores[i] > bestScore ? scores[i] : bestScore;
        }
        return  bestScore;
    }

}
