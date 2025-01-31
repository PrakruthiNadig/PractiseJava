package arraysconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
           int arr[] = {24, 33, 13, 65};
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;


//        System.out.println("Reversed Array: ");
//        for (int num : arr) {
//            System.out.print(num + " ");


        //You can convert the array to a List, reverse the list, and then convert it back to an array if necessary.
        List<Integer> ll = new ArrayList<>();
        for (int num1 : arr) {
            ll.add(num1);
        }

        Collections.reverse(ll);

        for (int num1 : ll) {
            System.out.print(num1 + " ");
        }
    }

}

