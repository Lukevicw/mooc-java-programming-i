
import java.util.Scanner;



public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(times);
    }

    // your own methods here
    public static void printFromNumberToOne(int number) {
        int i = 1;
        while (number >= i) {
            System.out.println(number);
            number--;
        }
    }
}