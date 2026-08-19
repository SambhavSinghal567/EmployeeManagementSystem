package com.employeemanagementsystem.utility;

import java.util.Scanner;

public class Input {
   static Scanner sc = new Scanner(System.in);

    public static String inputString() {
        String str = sc.next();
        sc.nextLine();
        return str;
    }
    public static String inputFullString() {
        String Str = sc.nextLine();
       // sc.nextLine();
        return Str;
    }
    public static int inputInt() {
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }
    public static double inputDouble() {
        double num = sc.nextDouble();
        sc.nextLine();
        return num;
    }

}
