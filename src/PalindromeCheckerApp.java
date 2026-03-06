import java.util.*;

/**
 * Strategy Interface: Defines the contract for all palindrome algorithms.
 */
interface PalindromeStrategy {
    boolean isValid(String input);
}

/**
 * Concrete Strategy 1: Using a Stack (LIFO)
 */
class StackStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (char c : clean.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        return clean.equals(reversed.toString());
    }
}

/**
 * Concrete Strategy 2: Using a Deque (Two-Way)
 */
class DequeStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (char c : clean.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

/**
 * Context Class: Uses a strategy to perform the check.
 */
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.isValid(input);
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeContext context = new PalindromeContext();
        String testPhrase = "Race Car";

        // Runtime Decision: Using Stack Strategy
        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " + context.executeStrategy(testPhrase));

        // Runtime Switch: Using Deque Strategy
        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy: " + context.executeStrategy(testPhrase));
    }
}