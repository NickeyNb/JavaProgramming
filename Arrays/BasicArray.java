// Arrays in java = List of items of the same type(zero-indexed)
// collection of data types(primitives or objects)

// Basic input output in 1-D and 2-D arrays.

import java.util.*;

public class BasicArray {

    // 1-D array
    public static void oneDimArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of 1-D array : ");        
        int size = sc.nextInt();    // can be find arr.length;

        // int[] arr=new int[5];
        // it states that arr is a reference variable pointing to an Array object in the heap that contain int type elements.
        
        int[] arr;  // Declaration of array, arr is getting defined in the stack (happens at compile time)
        arr = new int[size];    // initialization: actually here object is being created in the memory(heap).(happens at run time)
        // new is used to create an object in heap memory. => Dynamic memory allocation
        // arr(reference var) is pointing to Array object in the heap, which can anywhere be in heap
        // heap object is not continious
        // Java : array may not be continious (as it depends on jvm)

        // System.out.println(arr[0]); // by default it stores 0
        // if string array then by default it stores null

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
        // for-each
        for(int val:arr) {  // int val is type of elements in arr. If it will be 2-d it will be int[] as every element will be int[]
            System.out.println(val);
        }
        // Arrays class
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]  
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
        
        // using Arrays.toString(arr);
        for(int row=0;row<arr.length;row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        //
        for(int[] val:arr) {
            System.out.println(Arrays.toString(val));
        }
        sc.close();
    }
    
    // extra-stuff about array
    public static void extraStruff(int[] nums) {

        nums[0] = 100;
        // changes the original as 
        // 

        // array of Objects
        String[] str = new String[3];
        str[0] ="one";
        str[1] ="two";
        str[2] ="three";

        for(int val=0;val<str.length;val++) {
            System.out.println(str[val]);
        }
        //
        System.out.println(Arrays.toString(str));   // [one, two, three]

        
    }
    public static void main(String[] args) {
        // oneDimArray();
        // twoDimArray();

        int[] arr = {1, 2, 3};
        extraStruff(arr);   // copy of {1, 2, 3} is passed but nums and arr points to same
        // so any changes made to nums will affect the original arr
    }    
}