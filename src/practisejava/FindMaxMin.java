package practisejava;

public class FindMaxMin {


    public static void main(String[] args) {
        int a[] = {34, 65, 12, 89, 45};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);

    }
}
