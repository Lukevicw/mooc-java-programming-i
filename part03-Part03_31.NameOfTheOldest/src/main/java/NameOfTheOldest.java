
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        int biggest = 0;
        int checker = 0;
        String thename = "";
        while (true) {            
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            checker = Integer.valueOf(parts[1]);
            if (checker > biggest) {
                biggest = checker;
                thename = parts[0];
            } 
        } System.out.println("Name of the oldest: " + thename);
    }
}
