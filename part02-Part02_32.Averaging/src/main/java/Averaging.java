
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        int result = number1 + number2 + number3 + number4;
        return result;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int real = number1 + number2 + number3 + number4;
        double mean = (double)real/4; 
        //write some code here
        return mean;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
