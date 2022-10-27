
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        List<String> names = new ArrayList<>();
        String longest = "a";
        String checker = "";
        int sum = 0;
        int counter = 0;
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            counter = counter + 1;
            checker = parts[0];
            if (longest.length() < checker.length()) {
                longest = checker;
            } 
        } 
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0 * sum/counter));
    } 
}
