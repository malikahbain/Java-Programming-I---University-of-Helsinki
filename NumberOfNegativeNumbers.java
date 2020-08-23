
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int negCount = 0;
        
        while(true){
            System.out.println("Give a number:");
            userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput < 0){
                negCount++;
            }
            
            if(userInput == 0){
                break;
            }
        }
        
        System.out.println("Number of negative numbers: " + negCount);
    }
}
