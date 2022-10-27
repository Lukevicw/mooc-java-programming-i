
public class AdvancedAstrology {

    public static void printStars(int number){
        for(int i = 0; i < number; i++) {
            System.out.print("*");
            //System.out.println("");
        }
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print(" ");
        }
        
        
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        int numSize = 0;
        while (numSize < size) {
            printSpaces(size - numSize - 1);
            printStars(numSize);
            numSize++;
            //System.out.println("");
        }
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        for(int i = 0; i < height; i++) {
            
            printSpaces(height - 1 - i);
            printStars(2 * i + 1);
        }
            
        for(int i = 1; i < 3; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
        
        
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(1);
        System.out.println("___");
        printTriangle(3);
        System.out.println("___");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
