
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                lines.add(Integer.valueOf(reader.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Exception");        
        }
        
        int counter = 0;
        
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i) >= lowerBound && lines.get(i) <=upperBound) {
                counter += 1;
                
            } 
        } System.out.println("Numbers: " + counter);
    }
}
