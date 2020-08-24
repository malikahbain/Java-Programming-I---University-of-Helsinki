
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int index = 1;
            String userText = scanner.nextLine();
            String[] words = userText.split(" ");

            if (userText.equals("")){
                break;
            } else {
                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
