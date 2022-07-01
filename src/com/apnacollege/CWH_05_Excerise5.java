package com.apnacollege;
import java.util.Scanner;
public class CWH_05_Excerise5 {
    public static void main(String[] args) {
        //wrtie a program to detect whether a number entered by the user is integer or not
        System.out.println("Detect whether a number is integer or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        System.out.println(sc.hasNextInt());

    }
}
