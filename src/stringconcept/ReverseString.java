package stringconcept;

public class ReverseString {


    public static void main(String[] args) {
        //1. using StringBuilder //single thread env
        String str = "Java World";
        String rev = "";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());




        //3. using char array
        char[] ch= str.toCharArray();

        for(int i = 0,j=ch.length-1;  i<j;  i++,j--)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            String reversed = new String(ch);
            System.out.println("Reversed String: " + reversed);
        }





        //2.using for Loop

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }






}
