package com.apnacollege;
import java.util.Scanner;
public class CWH_05_Excerise2 {
    public static void main(String[] args) {
        //wrtie a program to calculate CGPA using marks of three subjects
        System.out.println("Calculate CGPA");
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the marks of maths: ");
        float a = sc.nextInt();
        System.out.print("Enter the marks of science: ");
        float b = sc.nextInt();
        System.out.print("Enter the marks of Music: ");
        float c = sc.nextInt();
        float sum = (a+b+c)/30;
        System.out.print("CGPA of three subjects is : "+sum);
    }
}
