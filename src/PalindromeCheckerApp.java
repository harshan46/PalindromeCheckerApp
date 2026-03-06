/**
 * UC4: Character Array Based Palindrome Check
 * This version uses a two-pointer approach on a char array for optimal performance.
 */
public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        // Step 1: Initialize the string and convert to character array
        String word = "racecar";
        char[] charArray = word.toCharArray();

        boolean isPalindrome = true;

        // Step 2: Initialize Two Pointers
        int start = 0;                   // Pointer at the beginning
        int end = charArray.length - 1;  // Pointer at the end

        // Step 3: Compare characters moving toward the center
        while (start < end) {
            // Check if characters at current pointers match
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // Optimization: Exit early if a mismatch is found
            }

            // Move pointers closer to each other
            start++;
            end--;
        }

        // Step 4: Display the result
        System.out.println("Input Word: " + word);
        if (isPalindrome) {
            System.out.println("Result: '" + word + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + word + "' is NOT a Palindrome.");
        }
    }
}