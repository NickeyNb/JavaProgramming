// 1- Create an array of 5 floats and calculate their sum.
// 2- Wap to find out whether a given integer is present  in an arr or not.
// 3- Wap to reverse in array.
// 4- Wap to add two matrices of 2X3.
// 5- Wap to find maximum element in the array.

import java.util.Scanner;

public class BasicQuestions {
    public static void answerOne() {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        float[] arr = new float[size];

        float sum=0;
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextFloat();
            sum += arr[i];
        }
        System.out.println("Sum of float is : " + sum);
    
        sc.close();
    }

    public static void answerTwo(int[] arr, int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == key) {
                System.out.println("Number is present in array.");
                return;
            }
        }
        System.out.println("Number is not present in array.");
    }
    
    public static void answerThree(int[] arr) {
        // Original array
        for(int val:arr) {
            System.out.print(val+" ");
        }
        System.out.println();

        // Reverse
        for(int i=0;i<arr.length/2;i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

        // Reverse array
        for(int val:arr) {
            System.out.print(val+" ");
        }
    }
    
    public static void answerFour(int[][] arr1, int[][] arr2) {
        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr1[0].length;j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        // Summed matrix is
    }
    
    public static void answerFive(int[] arr) {
        int mx=arr[0];
        for(int val:arr) {
            mx = Math.max(val, mx);
        }
        System.out.println("Maximum value is : "+mx);
    }
    
    public static void main(String[] args) {
        answerOne();

        int[] arr = {1, 2, 3, 4, 5};
        answerTwo(arr, 2);   // passed as arg

        answerThree(arr);

        int[][] arr1={{1, 2, 3}, {4, 5, 6}};
        int[][] arr2={{1,2,3}, {4, 5, 6}};
        answerFour(arr1, arr2);

        answerFive(arr);
    }

}