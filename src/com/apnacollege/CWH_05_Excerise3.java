package com.apnacollege;
import java.util.Scanner;
public class CWH_05_Excerise3 {
    //write a program which ask the user to enter his/her name
    // and greets them with "HEllo" <name> , have a good day
    public static void main(String[] args) {
        System.out.println("Greeting message");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.next();
        System.out.print("Hello "+ str + " Have a nice day");
    }
}
