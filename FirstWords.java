
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String userInput = scanner.nextLine();
            
            if(userInput.equals("")){
                break;
            } else {
                String words[] = userInput.split(" ");
                System.out.println(words[0]);
            }
        }

    }
}
