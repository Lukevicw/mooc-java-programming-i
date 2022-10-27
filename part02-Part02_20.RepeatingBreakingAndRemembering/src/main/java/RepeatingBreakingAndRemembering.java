
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int tracker = 0;
        int even = 0;
        int odd = 0;
        // double average = sum/(tracker-1);
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            sum += number;
            tracker += 1;
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            
            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + (sum + 1));
                System.out.println("Numbers: " + (tracker - 1));
                double average = ((double)(sum+1)) / (tracker - 1);
                System.out.println("Average: " + average);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + (odd - 1));
                break;
            }
        }
    }
}
