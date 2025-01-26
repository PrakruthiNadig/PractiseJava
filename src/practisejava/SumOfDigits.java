package practisejava;

import java.util.Scanner;

public class SumOfDigits {

    public static int addDigits(int num) {
        int sum=0;
        while (num>0)
        {
            int digit= num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumOfDigits obj = new SumOfDigits();

        System.out.println( obj.addDigits(n));
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        while (n > 0) {
//            int digit = n % 10;   // get last digit
//            sum = sum + digit;  //
//            n = n / 10;
//
//        }
//        System.out.println(sum);
//    }

}
