// Loops in java

import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Numbers from 0-5
        // for-loop
        System.out.println("for loop");
        for(int i=0;i<6;i++) {
            System.out.println("Number is : "+i);
        }

        // Numbers from 6-10
        System.out.println("while loop");
        int i=6;
        while(i<11) {
            System.out.println("Number is : "+i);
            i=i+1;
        }

        // Numbers from 11-15
        System.out.println("do-while loop");
        int num=11;
        do {
            System.out.println("Number is : "+num);
            num++;
        } while(num <= 15);

        // print table input by the user
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("Table of " + number);
        for(int count=1;count<=10;count++) {
            System.out.println(number +" * "+count +" = " + number*count);
        }

        sc.close();
    }   
}