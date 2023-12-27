// variable length arguments.

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(10, 20, 30 ,40, 50);
        // v can have 0 or more than 0.
    }
    static void fun(int a, int b, int ...v) {
        // v will internally store it in array
        System.out.println(Arrays.toString(v)); // [30, 40, 50]
    }
}
