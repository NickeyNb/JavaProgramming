// Arrays in java = List of items of the same type(zero-indexed)
// Basic input output in 1-D and 2-D arrays.

import java.util.*;

public class BasicArray {

    // 1-D array
    public static void oneDimArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of 1-D array : ");        
        int size = sc.nextInt();    // can be find arr.length;

        // Initializing the array
        int[] arr = new int[size];
        // int[] arr = [1, 2, 3, 4];    // declaring and defining

        // input
        System.out.println("Enter values ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }

        // output
        System.out.print("The numbers in 1-D array are : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }

    // 2-D array
    public static void twoDimArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows and cols : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Initializing two dim. array
        int[][] arr = new int[rows][cols];

        System.out.println("Enter values : ");
        for(int i=0;i<rows;i++) {
            // cols in every row
            for(int j=0;j<cols;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output of 2-D array
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        sc.close();
    }
    public static void main(String[] args) {
        // oneDimArray();
        twoDimArray();
    }    
}