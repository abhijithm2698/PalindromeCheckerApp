/**
 * ================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This program compares execution time of different
 * palindrome checking approaches using System.nanoTime().
 *
 * @author Developer
 * @version 1.0
 */

import java.util.*;

public class PalindronecheckerApp {

    // Method 1: String reverse
    public static boolean checkUsingString(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    // Method 2: Stack
    public static boolean checkUsingStack(String word) {
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }

    // Method 3: Deque
    public static boolean checkUsingDeque(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // String method timing
        long start1 = System.nanoTime();
        checkUsingString(word);
        long end1 = System.nanoTime();

        // Stack method timing
        long start2 = System.nanoTime();
        checkUsingStack(word);
        long end2 = System.nanoTime();

        // Deque method timing
        long start3 = System.nanoTime();
        checkUsingDeque(word);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("Performance Comparison (in nanoseconds):");
        System.out.println("----------------------------------------");
        System.out.println("String Reverse Method: " + (end1 - start1));
        System.out.println("Stack Method: " + (end2 - start2));
        System.out.println("Deque Method: " + (end3 - start3));
    }
}

