//package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();


        
        while (true) {
            
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");

            numbers.add(parts[1]);
            
        }
        List<Integer> finalNumbers = numbers.stream().map(Integer::parseInt).collect(Collectors.toList());
        int largest = 0;
        int i = 0;
        for (Integer integer : finalNumbers) {
            if (integer > largest)
                largest = integer;

            }
        System.out.println("Age of the oldest: " + largest);
    }
}
