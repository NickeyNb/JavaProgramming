// Functions in Java
// Java has only pass by value no pass by reference

// primitives = byte, int, etc. => value is passed
// objects & stuff = value of the refernce variable is passed(both reference variable pointing to same object)


import java.util.*;

public class Functions{
    // function to print my name
    public static void printMyName(String naam) {   // name is parameter 
        System.out.println("Name is : "+naam);
    }

    // a -> 10
    // num1 -> 10
    // b-> 20
    // num2 -> 20
    public static void swap(int num1, int num2) {
        int temp=num1;
        num1=num2;
        num2=temp;
    }

    // arr -> 
            // {1, 2, 3, 4, 5}
    // nums ->
    // both pointing to the same

    // The copy reference(nums) also points to the same address so all the changes also reflect in the main method
    public static void changeValue(int[] nums) {
        nums[0] = 99;   // here, if you make changes to the object via this ref varable(nums), original value will be changed. 
        
    }
    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   // 10
        int b = sc.nextInt();   // 20

        swap(a, b); // here, value is passed
        // a->10
        // b->20
        System.out.println(a + " " + b);    // no change (10, 20)

        int[] arr={1, 2, 3, 4, 5};
        changeValue(arr);  
        // it creates a copy of the reference(arr) and then passes it as value to the method. 
        // arr->{1, 2, 3, 4, 5}
        sc.close();
    }
}
