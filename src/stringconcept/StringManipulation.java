package stringconcept;

public class StringManipulation {


    public static void main(String[] args) {
        String str = "Hello";
        str.concat("Java");
        System.out.println("string obj created by literal" + str);

        String str1 = new String("Python");
        str1.concat("Programming");
        System.out.println("string ob created by constructor" + str1);


        //String methods

        String str4 = "abcdefghijk";
        //charAt(int paramInt)
        System.out.println(str4.charAt(4));

        // concat(String paramString)
        System.out.println(str.concat("lmn"));// abcdefghijklmn

        System.out.println("ABC".equalsIgnoreCase("abc"));// true

        System.out.println("ABCDEFGH".length());// 8

        // replace(char paramChar1, char paramChar2)

        System.out.println("012301230123".replace('0', '4'));

        // replace(CharSequence paramCharSequence1, CharSequence
        // paramCharSequence2)
        System.out.println("012301230123".replace("01", "45"));// 452345234523


        // All characters from index paramInt
        // String substring(int paramInt)
        System.out.println("abcdefghij".substring(3)); // defghij


        // All characters from index 3 to 6
        System.out.println("abcdefghij".substring(3, 7)); // defg

        System.out.println("ABCDEFGHIJ".toLowerCase()); // abcdefghij

        System.out.println("abcdefghij".toUpperCase()); // ABCDEFGHIJ

        System.out.println("abcdefghij".toString()); // abcdefghij

        System.out.println(" abcd  ".trim()); // abcd

    }
}
