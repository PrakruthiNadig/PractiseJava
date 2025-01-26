package practisejava;

public class SecondSmallNumber {
    public static void main(String[] args) {
        int a[] = {31, 74, 22, 44, 12};
        int min = a[0];
        int secmin = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] != min)
                if (a[j] < secmin)
                    secmin = a[j];
        }

        System.out.println(secmin);
    }

}
