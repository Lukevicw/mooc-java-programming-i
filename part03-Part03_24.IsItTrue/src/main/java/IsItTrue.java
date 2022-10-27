
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String truth = "true";
        System.out.println("Give a string:");
        String word = (scanner.nextLine());
        if (word.equals(truth)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
}
