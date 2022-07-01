package com.apnacollege;

public class CWH_09_Operator_pre {
    public static void main(String[] args) {
        //Precedence of operators
         int a = 6*5-34/2;
        // = 30-34/2
        // = 30-17
        // = 13
        int b = 60/5-34*2;
        // =12-34*2;
        // =12-68
        // =-56

        //Quick quiz
        int x = 6;
        int y = 1;
        //int k = x * y/2;
        int k = x*x   - (4*x*y)/(2*x);
        System.out.println(k);



    }
}
