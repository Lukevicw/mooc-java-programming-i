import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
            
        }
        
        System.out.println("What information will be printed?");
        String response = scanner.nextLine();
        
        for (Book book: books) {
            if (response.equals("everything")) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getYear());
            } else if (response.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
        
        
        /*if (response.equals("everything")) {
            for (Book novel: books) {
                System.out.println(books);
            }
        } else if (response.equals("names")) {
            for (Book novel: books) {
                System.out.println(novel.getTitle());
            }
        } */
        
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
