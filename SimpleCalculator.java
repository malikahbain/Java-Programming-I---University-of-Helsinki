
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum, diff, prod;
        double quo;
        
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;
        quo = num1 / (double)num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = "+ diff);
        System.out.println(num1 + " * " + num2 + " = " + prod);
        System.out.println(num1 + " / " + num2 + " = "+ quo);
    }
}
