
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Variables in Java");
        
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        // String firstName = sc.next();    // takes only one token nickey nb = nickey
        String fullName = sc.nextLine();

        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        // Output
        System.out.println("Name is : "+fullName);
        System.out.println("Age is : " + age);
    }

}