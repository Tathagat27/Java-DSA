package Loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter char :");
        char ch = in.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }
        if(ch>='A' && ch<='Z'){
            System.out.println("Upper case");
        }
    }
}
