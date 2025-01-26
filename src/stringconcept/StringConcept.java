package stringconcept;

public class StringConcept {

    //string can be defeined in 2 ways

    //String literal-SCP
    public static void main(String[] args)
    {
        String originalString= "Hello I learn java ";

        //String Class constructor
        String anotherString= new String("Hello I like java");

//Stringimmutability example

        String modifiedString= originalString.concat("programming");

        //even after modification of originalString is Hello i learn java, the value of the originalString did not change= immutability
        System.out.println(originalString);


   // == and equals

        String s1= new String("Hello");
        String s2= new String("Hello");

        boolean res1= s1==s2; // they point to different memory references
        boolean res2= s1.equals(s2); // content is same

        System.out.println(res1);
        System.out.println(res2);


    }

}
