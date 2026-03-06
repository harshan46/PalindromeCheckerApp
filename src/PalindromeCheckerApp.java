/**
 * UC3: Palindrome Check Using String Reverse
 * This version manually reverses the string character by character to
 * demonstrate loop control and the behavior of the String class.
 */
public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        // Step 1: Initialize the original string
        String original = "level";
        String reversed = "";

        System.out.println("Original String: " + original);

        // Step 2: Loop through the original string backwards
        // Index starts at (length - 1) and goes down to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation: Creating a new string object in each iteration
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // Step 3: Comparison using .equals()
        // Note: '==' compares memory addresses; .equals() compares the actual text
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Status: The word is a Palindrome.");
        } else {
            System.out.println("Status: The word is NOT a Palindrome.");
        }
    }
}