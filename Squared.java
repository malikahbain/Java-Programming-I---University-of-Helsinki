
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int square;

        int num = Integer.valueOf(scanner.nextLine());
        square = num * num;
        
        System.out.println(square);
    }
}
