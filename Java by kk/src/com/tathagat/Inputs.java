package com.tathagat;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("What's your roll number?");
        Scanner input = new Scanner(System.in);
        long rollno = input.nextLong();
        System.out.println("Alright!!! So..Your roll number is " + rollno);
    }
}
