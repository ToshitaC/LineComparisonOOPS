package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonOOPS {
    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison OOPS program");
        LengthOfLine();
    }

    public static void LengthOfLine() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X1:");
        int x = sc.nextInt();
        System.out.print("Enter the value of X2:");
        int x1 = sc.nextInt();
        System.out.print("Enter the value of Y1:");
        int y = sc.nextInt();
        System.out.print("Enter the value of Y2:");
        int y1 = sc.nextInt();

        double length = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
        System.out.println("Length = " + length);
    }
}
