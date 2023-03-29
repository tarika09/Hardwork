import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("input operator + - x / :");
        String operator=scanner.next();

        if("+".equals(operator)){
        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));}
        else if ("-".equals(operator))
        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));
        else if ("x".equals(operator))
        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));
        else if ("/".equals(operator))
        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));


    }

}



