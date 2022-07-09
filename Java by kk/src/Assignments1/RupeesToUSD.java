package Assignments1;

import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rupees :");
        float Rs = in.nextFloat();
        System.out.println("In USD : " + (Rs*0.013) );
    }
}
