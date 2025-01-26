package stringconcept;

public class SubStringOccurence {

    public static int countSubstringOccurrences(String str, String substring) {
        // Initialize count to 0
        int count = 0;

        // Edge case: if the substring is empty or the string is empty
        if (str == null || substring == null || substring.isEmpty()) {
            return 0;
        }

        // Start searching from the beginning of the string
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;  // Increment count when substring is found
            index += substring.length();  // Move index forward to prevent re-counting the same occurrence
        }

        //First Iteration: Found at index 0, count becomes 1, index moves to 3.
        //Second Iteration: Found at index 3, count becomes 2, index moves to 6.
        //Third Iteration: Found at index 6, count becomes 3, index moves to 9.
        //Exit: No more occurrences, loop ends.
        return count;
    }

    public static void main(String[] args) {
        String str = "ababcabcabc";
        String substring = "abc";

        // Call the method and print the result
        int result = countSubstringOccurrences(str, substring);
        System.out.println("The substring '" + substring + "' occurs " + result + " times.");
    }

}
