import java.util.ArrayList;
import java.util.Scanner;

public class Search {
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
        sc.close();
    }
}