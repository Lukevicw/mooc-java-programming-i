
public class Smallest {

    public static int smallest(int number1, int number2) {
        if (number1 < number2) {
            int lower = number1;
            return lower;
        } else {
            int lower = number2;
            return lower;
        }

        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        //return lower;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
