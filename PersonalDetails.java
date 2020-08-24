
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        String longestName = "";
        
        while(true){
            String userInput = scanner.nextLine();
            
            if(userInput.equals("")){
                break;
            } else {
                String[] info = userInput.split(",");
                if(info[0].length() > longestName.length()){
                    longestName = info[0];
                }
                sum += Integer.valueOf(info[1]);
                count++;
            }
        }
        
        avg = sum / (double)count;
        
        System.out.println("Longest name: "  + longestName);
        System.out.println("Average of the birth years: "  + avg);

    }
}
