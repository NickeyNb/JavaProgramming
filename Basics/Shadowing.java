public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);  // 90
        int x=30;   // the class variable(at line 2) will be shadowned by this.
        System.out.println(x);  // 30
    }
}
