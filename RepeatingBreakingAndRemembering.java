
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;
        double avg = 0;

        System.out.print("Give numbers:");

        while(true){
            userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == -1){
                break;
            }
            
            count++;
            sum += userInput; 
            
            if(userInput%2 == 0){
                evenCount++;
            } else{
                oddCount++;
            }
        }
        
        avg = sum/(double)count;
        
        System.out.println("Thx! Bye!" );
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
