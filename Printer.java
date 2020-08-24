
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int upper = array.length - 1;
        for(int i = 0; i <= upper; i++){
            for(int j = 1; j <= array[i]; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
