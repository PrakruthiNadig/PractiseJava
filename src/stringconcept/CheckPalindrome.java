package stringconcept;

public class CheckPalindrome {
    static String str = "madam";
    static String rev = "";

    //using for loop
    public static void main(String[] args) {


        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("string: " + str + " is a palindrome");
        } else {
            System.out.println("string: " + str + " is not a palindrome");
        }

       // System.out.println(isPalindrome(str));
    }

//using counter

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;


    }
}





