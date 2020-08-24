
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 0;
        int upperBound = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.println("From where? ");
        lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        upperBound = Integer.valueOf(scanner.nextLine());   
        
        for (int i = lowerBound; i <= upperBound; i++){
            System.out.println(numbers.get(i));
        }
    }
}
