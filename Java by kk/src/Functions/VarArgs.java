package Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);
        multiple(2,1,2,3,4,5,5);
    }

    static  void multiple(int a,int ...v){
        System.out.println("a = "+a);
        System.out.println("v = "+Arrays.toString(v));
    }


    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
