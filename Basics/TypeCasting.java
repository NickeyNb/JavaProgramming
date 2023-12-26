import java.util.Scanner;
// java.util package and Scanner is class in than package

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Sum of Two");

        // Type casting(implecitely/automatic)
        // 1- Type compatible i.e number & float not string & float 
        // 2- In which we want to convert must be > than whatever we are inputting
        // float > int 

        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();   // if we input 5 
        System.out.println(a);  // output 5.0

        // Type casting = explicitely (Narrowing conversion)
        int num = (int)67.2f;
        System.out.println(num); // 67

        // automatic type promoting
        int x = 257;
        byte y = (byte)x;   // max size of byte is 256
        System.out.println(y);  // it will give 1 (257%256)


        // java works on unicode value(can print any language)
        int number = 'A';
        System.out.println(number); // 65



        sc.close();

    }
}
