
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int posCount = 0;
        double posAvg = 0; 
        double posSum = 0;
        
        while(true){
            System.out.println("Give a number:");
            userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput == 0){
                break;
            } else if(userInput > 0){
                posCount++;
                posSum += userInput;
            }
            
        }
        
        if(posCount == 0){
            System.out.println("Cannot calculate the average");
        } else {
            posAvg = posSum/posCount;
            System.out.println(posAvg);
        }
            
        
        
       
    }
}
