package arraysconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysConcept {

    public static void main(String[] args) {
        //initializing and declaring array
        int arr[] = {45, 33, 24};

        int arr2[];  //init
        arr2 = new int[5]; //declaring array of size 5


        // accessing array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (Integer e : arr) {
            System.out.println(e);
        }


        //copying array

        int[] originalArray = {1, 2, 3};
//copying the old array into new array, with length= old array_length+1;
        int newArray[] = Arrays.copyOf(originalArray, originalArray.length + 1);
        newArray[newArray.length - 1] = 4;   //array[array_size]=element


        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}

