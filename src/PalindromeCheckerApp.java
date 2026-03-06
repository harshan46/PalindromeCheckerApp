/**
 * UC9: Recursive Palindrome Checker
 * This class demonstrates how to solve the palindrome problem by
 * breaking it down into smaller sub-problems using recursion.
 */
public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "malayalam";

        System.out.println("Checking string: " + input);

        // Initial call to the recursive method
        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("Result: Success! It is a Palindrome.");
        } else {
            System.out.println("Result: Failure! It is NOT a Palindrome.");
        }
    }

    /**
     * Recursive method to check palindrome status.
     * @param str The string to check.
     * @param start The current left index.
     * @param end The current right index.
     * @return true if palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str, int start, int end) {
        // Base Condition 1: If pointers meet or cross, we've checked everything
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If characters at pointers don't match, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Step: Check the inner substring by moving pointers inward
        return isPalindrome(str, start + 1, end - 1);
    }
}