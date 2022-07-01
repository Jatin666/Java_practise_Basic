package com.apnacollege;
import java.util.Scanner;
public class CWH_05_Excerise4 {
    public static void main(String[] args) {
        //Wrtie a java program to convert kilometers to miles
        System.out.println("Convert kilometers to miles");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in kilometer: ");
        float a  = sc.nextInt();
        float conversion = (float) (a *(0.62137));
        System.out.print("After conversion Miles is : "+ conversion);

    }
}
