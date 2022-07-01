package com.apnacollege;
import java.util.Scanner;
public class CWH_05_Excerise1 {
    public static void main(String[] args) {
        //Write a  program to calulate percentage of a given students
        //in exam . His marks from 5 subjects must be taken as input from the keyboard
        //Marks are out of 100
        //Maths, English , Science , Computer , Music

        System.out.println("Taking input from the user for Marks ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Maths: ");//out of 100
        int a = sc.nextInt();
        System.out.print("Enter the marks of English: ");
        int b = sc.nextInt();
        System.out.print("Enter the marks of Science: ");
        int c = sc.nextInt();
        System.out.print("Enter the marks of Computer: ");
        int d = sc.nextInt();
        System.out.print("Enter the marks of Music: ");
        int e = sc.nextInt();
        int sum = a+b+c;
        System.out.println(sum);
        float percentage = (sum*100/500);
        System.out.print(percentage);


    }
}
