
import java.util.Scanner;



public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
       
        division(number1, number2);       
    }
   
    public static void division(int numerator, int denominator) {
        //double num = numerator;
        //double den = denominator;
        double result = (double) numerator / denominator;
        System.out.println(result);
    }
}