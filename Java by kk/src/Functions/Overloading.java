package Functions;

public class Overloading {
    public static void main(String[] args) {
       fun(85);                    //decided at compile time which function is it
        fun("jd");

    }

    static void fun(int a){
        System.out.println(a);
    }

    static  void  fun(String name){         //either (i) no. of args are different or ,(ii) type of args are diff.
        System.out.println(name);
    }

}
