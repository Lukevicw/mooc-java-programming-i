
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tracking = 0;
                
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                System.out.println("Number of numbers: " + tracking);
                break;
            } else {
                tracking = tracking +1;
                continue;
            }
        }

    }
}
