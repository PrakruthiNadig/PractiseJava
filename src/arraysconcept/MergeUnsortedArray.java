package arraysconcept;

import java.util.Arrays;

public class MergeUnsortedArray {

    public static int[] mergeUnsortedArrays(int[] arr1, int[] arr2) {

        if (!(isSorted(arr1)) || (!isSorted(arr2))) {
            return null;
        }
        //created mergedarray
        int mergedArray[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }


    private static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;  // Array is not sorted
            }
        }
        return true;  // Array is sorted
    }

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5};
        int arr2[] = {2, 4, 6};

        int result[]= mergeUnsortedArrays(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }
}
