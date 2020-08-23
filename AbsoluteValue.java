
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int abs;
        
        int num = Integer.valueOf(scanner.nextLine());
        
        if (num < 0){
            abs = num * -1;
            System.out.println(abs);
        } else {
            abs = num;
            System.out.println(abs);
        }
          
    }
}
