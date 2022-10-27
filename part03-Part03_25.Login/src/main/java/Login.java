
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user1 = "alex";
        String pass1 = "sunshine";
        String user2 = "emma";
        String pass2 = "haskell";
        
        System.out.println("Enter username:");
        String userEntry = (scanner.nextLine());
        System.out.println("Enter password: ");
        String passEntry = (scanner.nextLine());
        if ((user1.equals(userEntry) && pass1.equals(passEntry))) {
            System.out.println("You have successfully logged in!");
        } else if ((user2.equals(userEntry) && pass2.equals(passEntry))) {
            System.out.println("You have successfully logged in!");
            
        } else {
            System.out.println("Incorrect username or password");
        }

    }
}
