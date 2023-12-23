// Functions in Java

import java.util.*;

public class Functions{
    // function to print my name
    public static void printMyName(String name) {   // name is parameter 
        System.out.println("Name is : "+name);
    }

    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        printMyName(name);  // name is argument

        sc.close();
    }
}