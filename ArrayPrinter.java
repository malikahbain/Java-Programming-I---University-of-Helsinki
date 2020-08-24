
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int upper = array.length - 1;
        for(int i = 0; i <= upper; i++){
            if (i == upper){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
            
            
        }
        
    }
}
