
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            String line = scanner.nextLine();
            counter++;
            if (line.equals("end")) {
                System.out.println(counter - 1);
                break;
                               
            }

        }

    }
}
