import java.util.Scanner;

public class QuickSortRecursive {
    public static void quickSort (int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);

            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high){
        int pivot = array[high]; // choosing an element in the right side as the pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {
                i++;

                int temporaryValue = array[i];
                array[i] = array[j];
                array[j] = temporaryValue;
            }
        }

        int temporaryValue = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temporaryValue;

        return i + 1;

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


        quickSort(integerArray, 0, integerArray.length - 1);
        
        System.out.println("This is the sorted array: ");
        for (int value: integerArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        scnr.close();
    }
}
