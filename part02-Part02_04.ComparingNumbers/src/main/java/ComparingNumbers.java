
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        String strFirst = Integer.toString(first);
        String strSecond = Integer.toString(second);
                
        
        if (first > second) {
            System.out.println(strFirst + " is greater than " + strSecond);
        } else if (first < second) {
            System.out.println(strFirst + " is smaller than " + strSecond);
        } else {
            System.out.println(strFirst + "is equal to " + strSecond);
        }

    }
}
