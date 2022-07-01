package com.apnacollege;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args){

        System.out.println("Taking input from the user: ");
        //creating new instance
        Scanner sc = new Scanner(System.in);// system.in read from the keyboard
        System.out.print("Emter number 1 : " );
        int a = sc.nextInt();//whatever integer we put it will store in a
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The sum of these number is " + sum);
        //System.out.print(sum);
        //String str = sc.next() //it will read the character


    }
}
