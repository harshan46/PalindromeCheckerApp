import java.util.ArrayDeque;
import java.util.Deque;

/**
 * UC7: Deque-Based Optimized Palindrome Checker
 * Uses a Double-Ended Queue to compare characters from both ends simultaneously.
 */
public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "deified";

        // Step 1: Initialize the Deque
        // ArrayDeque is a highly efficient implementation of the Deque interface
        Deque<Character> deque = new ArrayDeque<>();

        // Step 2: Insert all characters into the Deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Step 3: Compare and Remove from both ends
        // We continue as long as there is more than 1 character to compare
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Display Result
        System.out.println("Checking: " + input);
        System.out.println("Method: Deque (Double-Ended Queue) Comparison");

        if (isPalindrome) {
            System.out.println("Result: Success! It is a Palindrome.");
        } else {
            System.out.println("Result: Failure! It is NOT a Palindrome.");
        }
    }
}