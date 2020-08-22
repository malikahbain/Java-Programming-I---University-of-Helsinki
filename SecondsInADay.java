
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfSeconds;

        System.out.println("How many days would you like to convert to seconds?");
        int numOfDays = Integer.valueOf(scanner.nextLine());

        numOfSeconds = numOfDays * 60 * 60 * 24;
        
        System.out.println(numOfSeconds);

    }
}
