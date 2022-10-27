
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double tracking = 0;
        double sum = 0;
                
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                System.out.println("Average of the numbers: " + sum / tracking);
                break;
            } else {
                sum = sum + number;
                tracking = tracking + 1;
                continue;
            }
        
        }
    }
}