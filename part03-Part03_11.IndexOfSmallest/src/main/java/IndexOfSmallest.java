import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);        
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        }
        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }
        int x = smallest;
        int index = 0;
        System.out.println("Smallest number: " + smallest);
        while (index < list.size()) {
            if (list.get(index) == x) {
                System.out.println(x + " Found at index: " + index);
                index++;
            } else {
                index++;
            }
        }
    }
}
