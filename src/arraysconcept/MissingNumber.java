package arraysconcept;

public class MissingNumber {

    public static int findMissingNumber(int arr[], int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum = actualSum + num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 7, 8};
        int n = 5;
        System.out.println(findMissingNumber(arr, n));

    }
}
