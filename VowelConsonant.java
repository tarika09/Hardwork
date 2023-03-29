import java.util.Scanner;

public class VowelConsonant {
    public static void main(String args[]) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Alphabet A-Z in capital:");
        String Character = scanner.next();

        if ("A".equals(Character) || "E".equals(Character) || "I".equals(Character) || "O".equals(Character) || "U".equals(Character))
        System.out.println("Input letter is Vowel");
        else

    System.out.println("Input letter is Consonant");







    }
}