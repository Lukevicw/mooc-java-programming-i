

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;                
        
        System.out.println("Search for? ");
        int x = Integer.valueOf(scanner.nextLine());
        int index = 0;
        boolean found = true;
        while (index < array.length) {
            if (array[index] == x) {
                System.out.println(x + " is at index " + index + ".");
                found = false;
                break;
                //index++;
            } else {
                index++;
            }
        } if(found) {
            System.out.println(x + " was not found");
        }        
        // Implement the search functionality here
    }

}
