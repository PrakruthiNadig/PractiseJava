package stringconcept;

import java.lang.String;

public class ReverseStringRecursion {
    //a method calls itself


    public static void main(String[] args) {

        String str="Automation";
        System.out.println(str.substring(1));
    }

    public static String getReverse(String s) {
    //    String s = "Automation";
        if (s.isEmpty()) {
            return s;
        }
        return getReverse(s.substring(1)) + s.charAt(0);
    }

}
