
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while(true){
            String userInput = scanner.nextLine();
            
            if(userInput.equals("")){
                break;
            } else {
                String[] userInfo = userInput.split(",");
                if (Integer.valueOf(userInfo[1]) > oldest){
                    oldest = Integer.valueOf(userInfo[1]);
                }
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
