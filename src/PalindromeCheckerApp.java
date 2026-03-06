import java.util.Stack;

/**
 * UC5: Stack-Based Palindrome Checker
 * This class uses the Stack data structure (LIFO) to reverse a string
 * and validate if it is a palindrome.
 */
public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        // Step 1: Initialize the input string
        String input = "noon";

        // Step 2: Create a Stack of Characters
        // The Stack will hold each character of the input string
        Stack<Character> stack = new Stack<>();

        // Step 3: Push Operation
        // Add each character of the string into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Step 4: Pop and Reconstruct
        // Since Stack is LIFO, popping characters reverses the string
        String reversedInput = "";
        while (!stack.isEmpty()) {
            reversedInput += stack.pop();
        }

        // Step 5: Display and Compare
        System.out.println("Input String: " + input);
        System.out.println("Reversed via Stack: " + reversedInput);

        if (input.equalsIgnoreCase(reversedInput)) {
            System.out.println("Result: Success! It is a Palindrome.");
        } else {
            System.out.println("Result: Failure! It is NOT a Palindrome.");
        }
    }
}