package Assignments1;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two No.s :");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if(n2>n1)
        System.out.println("The largest no is " + n2);
        else
            System.out.println("The largest no is " + n1);
    }
}
