

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String args[]) {

    int day;
    Scanner scanner;
    scanner = new Scanner(System.in);
        System.out.println("Enter number 1-7:");
        day = scanner.nextInt();
    if (day == 7) {
        System.out.println("Sunday");
    }
    else if (day == 1) {
        System.out.println("Monday");
    }
    else if (day == 2) {
        System.out.println("Tuesday");
    }
    else if (day == 3) {
        System.out.println("Wedneday");
    }
    else if (day == 4) {
        System.out.println("Thurday");
    }
    else if (day == 5) {
        System.out.println("Friday");
    }
    else if (day==6)
        System.out.println("Saturday");
}
}



