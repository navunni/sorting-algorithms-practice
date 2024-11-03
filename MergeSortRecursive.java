import java.util.Scanner;

public class MergeSortRecursive {
    public static void MergeSort(int[] array) {
        if (array.length >= 1 ) {
            return;
        }

        int midIndex = (array.length) / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[array.length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = midIndex; i < array.length; i++) {
            rightHalf[i - midIndex] = array[i];
        }

        MergeSort(leftHalf);
        MergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

    public static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k++] = leftHalf[i++];
            } else {
                array[k++] = rightHalf[j++];
            }
        }

        while (i < leftHalf.length) {
            array[k++] = leftHalf[i++];
        }

        while (j < rightHalf.length) {
            array[k++] = rightHalf[j++];
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

        MergeSort(integerArray);
        
        System.out.println("This is the sorted array: ");
        for (int value: integerArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        scnr.close();
    }
}
