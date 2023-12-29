// Error giving when declaring package
// Linear search

import java.util.*;

public class Search {
    // find minimum number
    static int minimumNumber(ArrayList<Integer> arr) {
        int mn=arr.get(0);
        for(int val:arr) {
            if(val < mn) {
                mn=val;
            }
        }

        return mn;
    }

    // search in a string
    static boolean stringSearch(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        // for(int i=0;i<str.length();i++) {
        //     if(str.charAt(i) == target) {
        //         return true;
        //     }
        // }
        // for each loop
        for(char ch : str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }
    // search in the array
    static int linearSearch(ArrayList<Integer> nums, int target) {
        if(nums.size() == 0) {
            return -1;
        }

        for(int idx=0;idx<nums.size();idx++) {
            if(nums.get(idx) == target) {
                return idx;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        /*
         * 
         
         System.out.print("Enter size of array : ");
         int size = sc.nextInt();
         
         System.out.println("Enter array elements : ");
         for(int i=0;i<size;i++) {
             int element = sc.nextInt();
             arr.add(element);
            }
            
            System.out.print("Enter target : ");
            int target = sc.nextInt();
            System.out.println(linearSearch(arr, target));
        */
        /*
         * 
         System.out.println("Enter the word : ");
         String strArr = sc.next();
         
         System.out.println("Enter the char : ");
         char character = sc.next().charAt(0);
         
         System.out.println(stringSearch(strArr, character));
         */
        /*
         * 
         */
        System.out.println("Enter the size : ");
        int size=sc.nextInt();

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Minimum number is : " + minimumNumber(arr));
         sc.close();
    }
}