
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum;

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        
        sum = num1 + num2;
        
        double sqRt = Math.sqrt(sum);
        
        System.out.println(sqRt);
        
    }
}
