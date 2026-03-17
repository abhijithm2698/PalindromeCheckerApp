/**
 * ================================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using recursion by comparing characters from both ends.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindronecheckerApp {

    // Recursive method
    public static boolean isPalindrome(String word, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        // Call recursive function
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}