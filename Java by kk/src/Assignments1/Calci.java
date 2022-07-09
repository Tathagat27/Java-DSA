package Assignments1;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two no. :");
        float n1 = in.nextFloat();
        float n2 = in.nextFloat();
        System.out.println("Choose any operator from '+,-,*,/' :");
        char ch = in.next().charAt(0);

        if (ch == '+') {
            System.out.println("Ans = " + (n1 + n2));
        } else if (ch == '-') {
            System.out.println("Ans = " + (n1 - n2));
        } else if (ch == '*') {
            System.out.println("Ans = " + (n1 * n2));
        } else if (ch == '/') {
            System.out.println("Ans = " + (n1 / n2));
        }
    }
}
