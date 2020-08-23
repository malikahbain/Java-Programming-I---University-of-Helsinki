
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fact = 1;

        System.out.print("Give a number: ");
        int userInput = Integer.valueOf(scanner.nextLine());

        for(int i = 1; i <= userInput; i++){
            fact *=  i;
        }
        
        System.out.println("Factorial: " + fact);
    }
}
