
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int beg = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(beg, end);

    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            int numbers = i;
            if (numbers % 3 == 0) {
                System.out.println(numbers);
            }

        }
    }
}
