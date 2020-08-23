
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        System.out.println("How many times?");
        int numOfTimes = Integer.valueOf(scanner.nextLine());
        
        while(true){
            if(count == numOfTimes){
                break;
            } else{
                printText();
            } 
            count++;
        }
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
