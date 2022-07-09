package Assignments1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter your Name :");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello "+name);
    }
}
