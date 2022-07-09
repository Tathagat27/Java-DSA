package Functions;

public class Shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        //System.out.println(x);
        x=20;
        System.out.println(x);
        System.out.println(x);
        fun();
        System.out.println(x);
    }

    static void fun(){
        int x = 30;
        System.out.println(x);
    }

}
