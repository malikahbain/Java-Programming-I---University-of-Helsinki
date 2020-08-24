
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int searchNum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
       
        System.out.println("Search for? ");
        searchNum = Integer.valueOf(scanner.nextLine());
        
        int upperBound = list.size() - 1;
        for (int i = 0; i <= upperBound; i++){
            if (searchNum == list.get(i)){
                System.out.println(searchNum + " is at index " + i);
            }
        }
    }
}
