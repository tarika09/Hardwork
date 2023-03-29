import java.util.Scanner;
public class StudentMarkSheet {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }



        System.out.println("Total MArks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
        System.out.println("Percentage is " +percentage+ "%");

        if(percentage >= 35)
            System.out.println("\nStudent has PASSED\n");

        else
            System.out.println("\nStudent has FAILED\n");

        if(percentage >= 80)
            System.out.println("Grade A*");

        else if(percentage >= 60 && percentage < 80)
            System.out.println("Grade A");
        else if(percentage >= 50 && percentage < 60)
            System.out.println("Grade B");
        else if(percentage >= 35 && percentage < 50)
            System.out.println("Grade C");
        }
    }






