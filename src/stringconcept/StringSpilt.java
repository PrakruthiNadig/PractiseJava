package stringconcept;

public class StringSpilt {


    public static void main(String[] args) {
        String sentence = "Testing reverse string";
        String rev = "";
        String[] words = sentence.split("");

        for (int i = words.length-1; i >= 0; i--) {
            rev = rev + words[i];
        }
        System.out.println(rev);




    }
}
