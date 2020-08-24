
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input ==  9999) {
                break;
            }

            list.add(input);
        }
        
        int upperLimit = list.size() - 1;
        int smallestNum = list.get(0);
        
        for (int i = 1; i <= upperLimit; i++){
            if (list.get(i) < smallestNum){
                smallestNum = list.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallestNum);
       
        for (int i = 0; i <= upperLimit; i++){
            if (smallestNum == list.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
         
    }
}
