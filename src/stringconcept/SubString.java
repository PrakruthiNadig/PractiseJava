package stringconcept;

//WAP to check if given substring exists within String
public class SubString {

    public static void main(String[] args) {
        String s = "Hello java";
        String sub = "java";
        //    System.out.println(checkSubString(s, sub));


        String url = "https://subdomain.example.com";
      //  System.out.println(getSubDomain(url));

        String fileName = "image.jpeg";
        System.out.println(getFileExtension(fileName));


    }


    public static boolean checkSubString(String s, String sub) {
        if (s.contains(sub))
            return true;

        else
            return false;
    }

    public static String getSubDomain(String url) {

        int start = url.indexOf("://") + 3; //5+3
        System.out.println(start);
        int end = url.indexOf(".", start);
        System.out.println(end);
        return url.substring(start, end); // 8 ,8

    }


    public static String getFileExtension(String fileName) {

        int lastDotIndex = fileName.lastIndexOf(".");
        if (lastDotIndex == -1)
            return "";
        else
            return fileName.substring(lastDotIndex + 1);

    }
}
