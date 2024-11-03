import java.util.Scanner;

public class InsertionSortNonRecursive {
    public static void InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter the number of elements: ");
        Scanner scnr = new Scanner(System.in);
        int input = scnr.nextInt();

        int[] array = new int[input];

        System.out.println("Enter the elements of the array (seperated by spaces) ");
        for (int i = 0; i < input; i++) {
            array[i] = scnr.nextInt();
        }

        InsertionSort(array);

        System.out.println("This is the sorted array: ");
        for (int value: array) {
            System.out.print(value + " ");
        }

        scnr.close();
    }
}
