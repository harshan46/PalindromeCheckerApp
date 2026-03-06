/**
 * UC2: Print a Hardcoded Palindrome Result
 * This class validates a pre-defined string to check if it reads the same backwards.
 */
public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {
        // String Literal: The word to be checked
        String original = "madam";
        String reverse = "";

        // Logic: Building the reversed string using a loop
        // We start from the last character and move to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        System.out.println("Checking word: " + original);
        System.out.println("Reversed word: " + reverse);

        // Conditional Statement: if-else to compare strings
        if (original.equals(reverse)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}