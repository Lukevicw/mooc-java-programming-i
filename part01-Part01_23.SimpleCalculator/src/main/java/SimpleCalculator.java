
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        String x = Integer.toString(first);
        String y = Integer.toString(second);
        
        int addition = (first + second);
        int subtraction = (first - second);
        int multiplication = (first * second);
        double divide = ((double) first / (double) second);

        System.out.println(x + " + " + y + " = " + addition);
        System.out.println(x + " - " + y + " = " + subtraction);
        System.out.println(x + " * " + y + " = " + multiplication);
        System.out.println(x + " / " + y + " = " + divide);
        
    }
}
