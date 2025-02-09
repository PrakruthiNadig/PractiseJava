package mapconcept;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 8, 4};
        int size = 9; //1-9
        findMissingNumber(arr, size);
    }

    public static void findMissingNumber(int arr[], int size) {
//defining and init array
        boolean[] present = new boolean[size + 1];

        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;   //when arr[i]is present, marking  present[i]=true
        }
        System.out.println("Missing numbers");
        for (int i = 0; i < arr.length; i++) {
            if (!present[i]) {
                System.out.println(i + "");
            }
        }
    }
}
