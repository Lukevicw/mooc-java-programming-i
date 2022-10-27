
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String sentence = (scanner.nextLine());
        while (true) {
            String sentence = (scanner.nextLine());
            if (sentence.equals("")) {
                break;
            } else {
                String[] pieces = sentence.split(" ");
                int length = (pieces.length - 1);
                for (int i = 0; i <= pieces.length - 1; i++) {
                    System.out.println(pieces[i]);
                }
                
            }
        }
    } 
}
