package Assignments1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter any string :");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        boolean flag=true;
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1))
                flag=false;
        }
        if(flag==true){
            System.out.println(str + " is a Palindrome.");
        }
        else
            System.out.println(str + " is not Palindrome.");
    }
}
