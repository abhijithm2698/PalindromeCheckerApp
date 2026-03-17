/**
 * ================================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This program converts a string into a character array
 * and checks whether it is a palindrome using the
 * two-pointer technique.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindronecheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Convert string to char array
        char[] chars = word.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}