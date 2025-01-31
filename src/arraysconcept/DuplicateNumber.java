package arraysconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateNumber {

    //using hashset
    public static void finDuplicate(int arr[]) {
        HashSet<Integer> hSet = new HashSet<>(); //created hashset which allows on distinct values
        List<Integer> lnum = new ArrayList<>(); //created list

        for (int num : arr) {
            if (!(hSet.add(num))) {   // if returning true only then print number
                System.out.println("the duplicate value :" + num);
            }
        }


    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 5, 8, 9, 4};
        // finDuplicate(arr);
        findDuplicateSorting(arr);
    }


    //using sorting

    public static void findDuplicateSorting(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println(arr[i]);
            }

        }

    }

}
