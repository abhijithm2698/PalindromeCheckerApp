/**
 * ================================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindronecheckerApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("========================================");
        System.out.println("     PALINDROME CHECKER APPLICATION     ");
        System.out.println("========================================");

        // Display application details
        System.out.println("Welcome to the Palindrome Checker App!");
        System.out.println("Version: 1.0");

        // End message for UC1
        System.out.println("----------------------------------------");
        System.out.println("Application started successfully.");
        System.out.println("Ready for next use case...");
    }
}