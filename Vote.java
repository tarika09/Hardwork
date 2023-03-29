import java.util.Scanner;

public class Vote {
    Scanner scanner = new Scanner(System.in);
    public void eligibleForVote() {
        System.out.println("Please enter your age in inter value");
        //age in variable using scanner object
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for vote as your age is :" + age);

        } else {
            System.out.println("You are not eligible for vote as your age is :" + age);

        }
    }

    public static void main(String[] args) {
        Vote vote = new Vote();
        vote.eligibleForVote();
    }
    }


