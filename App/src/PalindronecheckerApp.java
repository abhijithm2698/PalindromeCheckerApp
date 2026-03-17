/**
 * ================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by reversing it using a loop and comparing results.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindronecheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Reverse using loop
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i); // concatenation
        }

        // Compare using equals()
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}