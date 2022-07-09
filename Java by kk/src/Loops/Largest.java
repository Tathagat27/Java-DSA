package Loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three no.s :");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int max = n1;
        if(n2>max){
            max = n2;
        }
        if (n3>max){
            max = n3;
        }
        System.out.println("Maximum number is :" + max);

    }
}
