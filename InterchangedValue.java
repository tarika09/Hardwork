import java.util.Scanner;

public class InterchangedValue {
    public static void main (String[] args) {
        int x,y,t; //x and y to swap
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter values of x and y");
        x= scanner.nextInt();
        y=scanner.nextInt();
        System.out.println("before swapping numbers:"+x+" "+y);

        t=x;
        x=y;
        y=t;
        System.out.println("After swapping: "+x+" "+y);
        System.out.println();


        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = x ^ y ^ (y = x);
        System.out.println("Swapped values of x and y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
