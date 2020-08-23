
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputSq;

        while(true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0){
                System.out.println("Unsuitable number");
                continue;
            }
            
            if (input == 0){
                break;
            }
            
            if (input > 0){
                inputSq = Math.pow(input, 2);
                System.out.println(inputSq);
            }
        }
    }
}
