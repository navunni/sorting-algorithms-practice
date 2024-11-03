import java.util.Scanner;

public class SelectionSortNonRecursive {
    public static void SelectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {

            int lowIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    lowIndex = j;
                }
            }
            int temporaryValue = array[i];
            array[i] = array[lowIndex];
            array[lowIndex] = temporaryValue;
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

        System.out.println("These are the array values, before being sorted: ");
        System.out.println(input);

        SelectionSort(integerArray);
        
        System.out.println("This is the sorted array: ");
        for (int value: integerArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        scnr.close();
    }
}
