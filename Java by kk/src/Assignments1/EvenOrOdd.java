package Assignments1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        if(num%2==0)
            System.out.println(num + " is an even number");
        else
            System.out.println(num + " is an odd number");
    }
}
