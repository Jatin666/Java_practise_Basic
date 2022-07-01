package com.apnacollege;

public class CWH_12_Excercise2 {
    public static void main(String[] args) {
        //write a java program to encrypt a grade by adding 8 to it . decrypt it to show the correct one
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);

        //decrypt
        grade =(char)(grade-8);
        System.out.println(grade);

    }
}
