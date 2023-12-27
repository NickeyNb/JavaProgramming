public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        {
            // int a = 30; // we can't initialize as it is already initialized;
            a = 30; // can modify
            int c = 50; // it was not declared before so its ok!.
            System.out.println(c);  
        }
        // System.out.println(c);  // incorrect, it will remain in that scope
        System.out.println(a + " "+ b);
    }
}
