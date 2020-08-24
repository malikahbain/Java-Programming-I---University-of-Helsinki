
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == -1){
                break;
            }
            
            numbers.add(userInput);
        }
        
        for(Integer num : numbers){
            sum += num;
        }
        
        avg = sum/(double)numbers.size();
        
        System.out.println("Average: " + avg);
        
    }
}
