import java.util.Scanner;

public class BubbleSortRecursive {
    public static void bubbleSortRecursive(int[] array, int n) { // n is the size of the inputted array. 
        if (n == 1) { // base case
            return;
        }

        for (int i = 0; i < array.length - 1; i++) { // performs one iteration of bubble sort.
            if (array[i] > array[i+1]) {
                int temporaryValue = array[i];
                array[i] = array[i+1];
                array[i+1] = temporaryValue;
            }
        }

        bubbleSortRecursive(array, n-1); // recursively calling the method with reduced array size. 
    }

    public static void main(String[] args) {
        System.out.println("Please enter the list of values that you would like to sort: ");
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();

        String[] array = input.trim().split("[,\\s]+");
        int[] integerArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            integerArray[i] = Integer.parseInt(array[i]);
        }

        bubbleSortRecursive(integerArray, integerArray.length);
        
        System.out.println("This is the sorted array: ");
        for (int value: integerArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        scnr.close();
    }
}
