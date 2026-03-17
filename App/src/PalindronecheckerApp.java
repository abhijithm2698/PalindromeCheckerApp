/**
 * ================================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This program uses a stack to reverse characters
 * and check whether a string is a palindrome.
 *
 * @author Developer
 * @version 1.0
 */

import java.util.Stack;

public class PalindronecheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}