/**
 * ================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This program uses the Strategy Design Pattern to dynamically
 * choose different palindrome checking algorithms.
 *
 * @author Developer
 * @version 1.0
 */

import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

// Main Class
public class PalindronecheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeContext context = new PalindromeContext();

        // Choose strategy dynamically
        context.setStrategy(new StackStrategy());
        // context.setStrategy(new DequeStrategy()); // try this also

        boolean result = context.execute(word);

        if (result) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}
