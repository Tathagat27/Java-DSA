package Assignments1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the values of Principal ,Time and Rate respectively :");
        Scanner in = new Scanner(System.in);
        float P = in.nextFloat();
        float T = in.nextFloat();
        float R = in.nextFloat();

        float SI = (P*T*R)/100;

        System.out.println("The S.I. is "+ SI);
    }
}
