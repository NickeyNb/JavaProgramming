// As arrays are of fixed size 
// So, for inputting any number I want we use ArrayList(which is a part of collection framework)
// Working:
    // size is fixed internally
    // if arraylist gets filled, it will create an arraylist of size double and copy the old element and delete the old arraylist

import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10); // we pass Wrapper classes not primitive
        // ArrayList<Integer> list = new ArrayList<>(10); // same, no error
        
        // initial capacity is 10

        // 2-d array list
        // ArrayList<ArrayList<Integer> > arr = new ArrayList<ArrayList<Integer>>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.contains(1));  // true
        list.set(0, 99);    // 0th index will be replaced with 99

        list.remove(2);     // remove index 2

        System.out.println(list);   // [1]

        
    }
}
