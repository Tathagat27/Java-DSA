package Assignments1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the no. upto which you want Fibonacci sequence :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a=0,b=1,fib;
        System.out.print("Fibonacci Sequence : 0, 1");
        for (int i=0;i<n-2;i++){
            fib=a+b;
            System.out.print(", " + fib );
            a=b;
            b=fib;
        }

    }
}
