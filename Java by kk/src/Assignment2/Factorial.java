package Assignment2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = in.nextInt();
        int i=1,fact = 1;
         while(i<=num){

             fact = fact * i;
             i++;
         }
        System.out.println("Factorail of " + num + " is : " + fact);

    }
}
