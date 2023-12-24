// Arrays in java = List of items of the same type(zero-indexed)

import java.util.*;

public class BasicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");        
        int size = sc.nextInt();    // arr.length

        // Initializing the array
        int[] arr = new int[size];
        // int[] arr = [1, 2, 3, 4];    // declaring and defining

        // input
        System.out.println("Enter the numbers ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }

        // output
        System.out.print("The numbers in array are : ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }    
}