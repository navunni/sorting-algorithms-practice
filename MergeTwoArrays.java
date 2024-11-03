import java.util.Arrays;

public class MergeTwoArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[m+n];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n) {
            merged[k++] = arr1[i++];
        }

        while (j < m) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 7, 9, 10, 15};
        int[] array2 = {4, 9, 10, 19, 25};
        int[] mergedArray = merge(array1, array2);
        System.out.println("The merged array is: " + Arrays.toString(mergedArray));
        int[] array3 = {1, 3};
        int[] newMergedArray = merge(mergedArray, array3);
        System.out.println("The new merged array is: " + Arrays.toString(newMergedArray));
    }
}
