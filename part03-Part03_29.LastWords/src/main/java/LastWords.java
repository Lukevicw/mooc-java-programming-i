
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] pieces = sentence.split(" ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(" ");
            int last = (pieces.length - 1);
            System.out.println(pieces[last]);
        }

    }
}
