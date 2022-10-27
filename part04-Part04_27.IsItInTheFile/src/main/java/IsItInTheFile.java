            
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();        
        boolean nonexist = false;
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());                
            }            
        } catch (Exception e) {
            nonexist = true;
        }
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if (lines.contains(searchedFor)) {
            System.out.println("Found!");
        } else if (nonexist == true) {
            System.out.println("Reading the file " + file + " failed");                    
        } else {
            System.out.println("Not found.");
        }
    }
}
