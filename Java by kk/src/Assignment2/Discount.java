package Assignment2;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter MRP :");
        float mrp = in.nextFloat();
        System.out.println("Enter Selling Price :");
        float sp = in.nextFloat();

        float discount = ((mrp-sp)/mrp)*100;

        System.out.println("Discount = " + discount + " %");

    }
}
