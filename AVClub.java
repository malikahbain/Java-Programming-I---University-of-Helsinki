
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String userText = scanner.nextLine();
            String[] words = userText.split(" ");

            if (userText.equals("")){
                break;
            } else {
                for (int i = 0; i < words.length; i++) {
                    if(words[i].contains("av")){
                        System.out.println(words[i]);
                    }
                    
                }
            }
        }
    }
}
