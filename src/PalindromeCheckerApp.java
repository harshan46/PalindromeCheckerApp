/**
 * UC10: Case-Insensitive & Space-Ignored Palindrome
 * This class demonstrates string normalization (preprocessing) to handle
 * real-world sentences and phrases.
 */
public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {
        // A classic sentential palindrome
        String rawInput = "A man a plan a canal Panama";

        System.out.println("Raw Input: \"" + rawInput + "\"");

        // Step 1: Normalization (Preprocessing)
        // .toLowerCase() handles Case-Insensitivity
        // .replaceAll("[^a-zA-Z0-9]", "") removes spaces and punctuation using Regex
        String processed = rawInput.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("Normalized: \"" + processed + "\"");

        // Step 2: Apply Two-Pointer Logic (from UC4)
        boolean isPalindrome = checkPalindrome(processed);

        // Step 3: Display Result
        if (isPalindrome) {
            System.out.println("Result: Success! It is a Palindrome.");
        } else {
            System.out.println("Result: Failure! It is NOT a Palindrome.");
        }
    }

    /**
     * Reusable two-pointer logic for normalized strings.
     */
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}