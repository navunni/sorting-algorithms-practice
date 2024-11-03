import java.util.Scanner;

public class BubbleSortNonRecursive {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temporaryValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporaryValue;
                }
            }
        }
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

        bubbleSort(integerArray);
        
        System.out.println("This is the sorted array: ");
        for (int value: integerArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        scnr.close();
    }
}