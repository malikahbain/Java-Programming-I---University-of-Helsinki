
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to? ");
        int userWhere = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int userFrom = Integer.valueOf(scanner.nextLine());
        
        for(int i = userFrom; i <= userWhere; i++){
            System.out.println(i);
        }
    }
}
