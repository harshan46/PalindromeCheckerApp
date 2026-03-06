import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * UC6: Queue + Stack Based Palindrome Check
 * Demonstrates the behavioral difference between FIFO (Queue) and LIFO (Stack).
 */
public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "radar";

        // Step 1: Initialize Data Structures
        Stack<Character> stack = new Stack<>();          // LIFO
        Queue<Character> queue = new LinkedList<>();     // FIFO (using LinkedList implementation)

        // Step 2: Load characters into both structures
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);   // Push to Stack
            queue.add(c);    // Enqueue to Queue
        }

        boolean isPalindrome = true;

        // Step 3: Compare Dequeue (FIFO) vs Pop (LIFO)
        // Queue returns 'r' (first in), Stack returns 'r' (last in)
        while (!stack.isEmpty()) {
            char fromStack = stack.pop();
            char fromQueue = queue.poll();

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Display Result
        System.out.println("Analyzing: " + input);
        System.out.println("Data Structures Used: Stack (LIFO) & Queue (FIFO)");

        if (isPalindrome) {
            System.out.println("Result: The word is a Palindrome.");
        } else {
            System.out.println("Result: The word is NOT a Palindrome.");
        }
    }
}