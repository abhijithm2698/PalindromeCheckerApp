/**
 * ================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by ignoring spaces and case differences.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindronecheckerApp {

    public static void main(String[] args) {

        // Original string
        String input = "Madam In Eden";

        // Step 1: Normalize string (remove spaces & convert to lowercase)
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Reverse string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Step 3: Compare
        if (cleaned.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome (ignoring case & spaces).");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}