
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest= 0;
        String oldestName = "";
        
        while(true){
            String userInput = scanner.nextLine();
            
            if(userInput.equals("")){
                break;
            } else {
                String[] userInfo = userInput.split(",");
                if (Integer.valueOf(userInfo[1]) > oldest){
                    oldest = Integer.valueOf(userInfo[1]);
                    oldestName = userInfo[0];
                }
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
