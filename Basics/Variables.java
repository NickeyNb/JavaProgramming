// Variables in java(Compiler ignores comments)

import java.util.*;

public class Variables {
    public static void main(String[] args) {
        
        System.out.println("Variables in Java");
        
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        // String firstName = sc.next();    // takes only one token nickey nb = nickey
        String fullName = sc.nextLine();

        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        
        System.out.print("Enter the height : ");
        double height = sc.nextDouble();

        // Output
        System.out.println("Name is : "+fullName);
        System.out.println("Age is : " + age);
        System.out.println("Height is : " + height);

        sc.close();;
    }

}