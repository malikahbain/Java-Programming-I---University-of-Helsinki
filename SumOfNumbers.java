
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int sum = 0;
        int count = 0;
        
        while(true){
            System.out.println("Give a number:");
            userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput == 0){
                break;
            }
            
            count++;
            sum += userInput;
            
        }
        
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
        
    }
}
