/**
 * ================================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This program encapsulates palindrome logic inside a class
 * and exposes a method to check palindrome.
 *
 * @author Developer
 * @version 1.0
 */

// Service class (Encapsulation)
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}

// Main class
public class PalindronecheckerApp {

    public static void main(String[] args) {

        String word = "Madam";

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        if (checker.checkPalindrome(word)) {
            System.out.println("\"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome.");
        }
    }
}