// Conditional statements in java

import java.util.*;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b) {
            System.out.println(a+" is equal to "+b);
        } else {
            if(a > b) {
                System.out.println(a+" is greater than "+b);
            } else {
                System.out.println(a+" is  less than "+b);
            }
        }

        // Switch
        int day=sc.nextInt();
        switch(day) {
            case 1:
                System.out.println("Its monday");
                break;
            case 2:
                System.out.println("Its tuesday");
                break;
            default:
                System.out.println("Some day");
                break;
        }
        sc.close();
    }
}