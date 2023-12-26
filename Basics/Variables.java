// Variables in java(Compiler ignores comments)

import java.util.Scanner;

public class Variables {    // class name must be Capital (good practice)
    public static void main(String[] args) {   
        // it is public bcuz compiler will acess it
        // it is static bcuz we want to run it directly without creating the object of Variables class
        
        // String[] args - It is a command line argument of string type array.
        // whateven argument you are giving from the terminal will store here in the form of array
        // java Variables "Hello" // args[0]=hello
        
        System.out.println("Variables in Java");
        // System-It is the final (class) defined in java.lang package
        // out-It is a variable of PrintStream type which is public and static member field of the System class
        // Print the ("") in out by default it is null means print it in cmd line.
            // out = SomeFile // in this case it is not null 
        // println-It is a method of PrintStream class
        
        
        // int a = 2_000_000;  
        // // two million(underscore will be ignored);
        // System.out.println(a);  // 2000000

        // Input
        Scanner sc = new Scanner(System.in);
        // sc is a variable pointing to scanner class
        // in means = keyboard input from cmd 
        // it is also null by default
    
        System.out.print("Enter the name : ");
        // String firstName = sc.next();    // takes only one token nickey nb = nickey
        String fullName = sc.nextLine();

        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        
        float marks = 94.2f;
        System.out.println("Marks is : "+marks);

        // every decimal points are of double by default and it more accurate than f
        System.out.print("Enter the height : ");
        double height = sc.nextDouble();

        // Output
        System.out.println("Name is : "+fullName);
        System.out.println("Age is : " + age);
        System.out.println("Height is : " + height);

        sc.close();;
    }

}