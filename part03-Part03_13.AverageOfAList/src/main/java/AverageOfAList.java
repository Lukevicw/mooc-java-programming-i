import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int sum = 0;
        int den = 0;
        for (Integer number: list) {    
            sum = sum + number;
            den = den + 1;
            
        }
        double average = (double) sum / den;
        System.out.println("Average: " + average);

        // toteuta listan lukujen summan laskeminen tänne
    }
}