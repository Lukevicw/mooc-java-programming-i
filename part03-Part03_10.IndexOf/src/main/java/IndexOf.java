
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Objects;

public class IndexOf {

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
        
        System.out.println("Search for?");
        int x = Integer.valueOf(scanner.nextLine());
        int index = 0;
        while (index < list.size()) {
            if (list.get(index) == x) {
                System.out.println(x + " is at index " + index);
                index++;
            } else {
                index++;
            }
        }
        // implement here finding the indices of a number
    }
}
