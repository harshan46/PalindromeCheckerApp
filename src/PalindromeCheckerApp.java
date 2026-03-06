/**
 * Service class that encapsulates the Palindrome logic.
 * This demonstrates Encapsulation and Reusability.
 */
class PalindromeService {

    /**
     * Checks if a string is a palindrome.
     * Logic is hidden from the user of the class (Abstraction).
     */
    public boolean check(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Normalize string inside the service
        String clean = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/**
 * UC11: Object-Oriented Palindrome Service
 * The main application class responsible for User Interaction.
 */
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {
        // Instantiate the Service Object
        PalindromeService service = new PalindromeService();

        String testWord = "Madam, I'm Adam";

        // Calling the encapsulated method
        boolean result = service.check(testWord);

        System.out.println("Testing Service with: " + testWord);
        System.out.println("Is Palindrome? " + (result ? "YES" : "NO"));
    }
}