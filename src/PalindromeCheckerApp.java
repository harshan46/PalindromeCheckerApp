import java.util.*;

/**
 * UC13: Performance Comparison
 * Measures and compares the execution time of different palindrome algorithms.
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        // A long string to make the performance difference noticeable
        String input = "Racecar".repeat(1000);

        System.out.println("Benchmarking Palindrome Algorithms...");
        System.out.println("Input Length: " + input.length() + " characters\n");

        // 1. Benchmark: Two-Pointer Approach (UC4 logic)
        long start = System.nanoTime();
        checkTwoPointer(input);
        long end = System.nanoTime();
        System.out.println("Two-Pointer Approach: " + (end - start) + " ns");

        // 2. Benchmark: Stack Approach (UC5 logic)
        start = System.nanoTime();
        checkStack(input);
        end = System.nanoTime();
        System.out.println("Stack (LIFO) Approach:  " + (end - start) + " ns");

        // 3. Benchmark: Deque Approach (UC7 logic)
        start = System.nanoTime();
        checkDeque(input);
        end = System.nanoTime();
        System.out.println("Deque Approach:         " + (end - start) + " ns");
    }

    // Optimization: Primitive char array comparison
    public static boolean checkTwoPointer(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i++] != arr[j--]) return false;
        }
        return true;
    }

    // High overhead: Object creation and boxing
    public static boolean checkStack(String str) {
        Stack<Character> stack = new Stack<>();
        String clean = str.toLowerCase();
        for (char c : clean.toCharArray()) stack.push(c);
        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // High overhead: Node/Link management
    public static boolean checkDeque(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toLowerCase().toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}