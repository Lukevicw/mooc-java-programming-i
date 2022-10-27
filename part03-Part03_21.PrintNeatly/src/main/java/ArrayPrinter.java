
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int i = 0;
        int end = (array.length - 1);
        int last = array[end]; //(array.length);
        while(i < (array.length -1)) {
            System.out.print(array[i] + ", ");
            i++;
        } System.out.print(last);        
        // Write some code in here
    }
}
