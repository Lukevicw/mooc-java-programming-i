
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] pieces = sentence.split(" ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(" ");
            System.out.println(pieces[0]);
        }

    }
}
