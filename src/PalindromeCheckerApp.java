/**
 * UC8: Linked List Based Palindrome Checker
 * Demonstrates node traversal, finding the middle, and in-place reversal.
 */
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "rotator";
        Node head = null, tail = null;

        // Step 1: Convert String to Singly Linked List
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 2: Find Middle using Fast and Slow pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse the second half of the list
        Node prev = null, current = slow, nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Step 4: Compare the first half and the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev; // Head of the reversed half
        boolean isPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Step 5: Output Results
        System.out.println("Input: " + input);
        if (isPalindrome) {
            System.out.println("Result: The Linked List is a Palindrome.");
        } else {
            System.out.println("Result: The Linked List is NOT a Palindrome.");
        }
    }
}