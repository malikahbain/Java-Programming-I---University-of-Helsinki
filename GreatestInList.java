
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatestNum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
       int upperLimit = list.size() - 1;
       for (int i = 0; i <= upperLimit; i++){
           if (list.get(i) > greatestNum){
               greatestNum = list.get(i);
           }
       }
        
        System.out.println("The greatest number: " + greatestNum);

    }
}
