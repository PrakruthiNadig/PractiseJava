package arraysconcept;

import java.util.Arrays;

public class MergeSortedArray {


    public static int[] mergedArray(int arr1[], int arr2[]) {

        //creating mergedArray with size sum of  the both the arrays

        int mergedArray[] = new int[arr1.length + arr2.length];
//i,j,k indexes to access arrays
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])        //IF first ele in arr1 < first ele in arr2
            {
                mergedArray[k++] = arr1[i++];  //copy arr1 first ele into arrayk and increase both index k and i
            } else {
                mergedArray[k++] = arr2[j++];
            }

        }


        //after this any 1 array will be fully merged into array k, for the remaining elements of other array
        //  we do this while loop

        while (i < arr1.length)   //if arr1 eles remaing
        {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }


        return mergedArray;
    }

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5};
        int arr2[] = {2, 4, 6};
//prints array reference -------syso(mergedArray())
        int result[] = mergedArray(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }


}

//Input:
//arr1 = [1, 3, 5], arr2 = [2, 4, 6]
//
//Steps:
//
//Compare 1 (arr1) with 2 (arr2), place 1 in mergedArray.
//Compare 3 (arr1) with 2 (arr2), place 2 in mergedArray.
//Compare 3 (arr1) with 4 (arr2), place 3 in mergedArray.
//Compare 5 (arr1) with 4 (arr2), place 4 in mergedArray.
//Compare 5 (arr1) with 6 (arr2), place 5 in mergedArray.
//arr1 is now exhausted, so copy the remaining 6 from arr2 into mergedArray.
//Output: mergedArray = [1, 2, 3, 4, 5, 6]