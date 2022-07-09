package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//    sum();
        int ans = sum2(20,30);
        System.out.println(ans);
    }

    static int sum2(int a,int b){
        return (a+b);
    }

    static void sum(){
        System.out.println("Enter two numbers :");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.println("Sum = " + (n1+n2));
    }

}
