import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int number, i;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        number = scanner.nextInt();

        if (number > 0)
            System.out.println("Positive number");
        else if (number < 0)
            System.out.println("Negative number");
        else
            System.out.println("Number is 0");
    }
}



