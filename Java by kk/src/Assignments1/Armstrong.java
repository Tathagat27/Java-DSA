package Assignments1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int a,sum=0,temp=n1;
        while (n1!=0)
        {
            a = n1%10;
            n1 = n1/10;
            sum = sum + (a*a*a);

        }
        if(sum==temp){
            System.out.println(temp + " is an Armstrong number");
        }
        else
            System.out.println(temp + " is not an Armstrong number");

        System.out.println("and");

        int b,s=0,t=n2;
    while (n2!=0)
    {
        b = n2%10;
        n2 = n2/10;
        s = s + (b*b*b);

    }
        if(s==t){
        System.out.println(t + " is an Armstrong number");
    }
        else
                System.out.println(t + " is not an Armstrong number");


}

}
