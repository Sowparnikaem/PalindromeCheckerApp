

public class PalindromeCheckerApp {


    public static void main(String[] args) {
        // Sample input
        String input = "radar";

        // Convert string to character array
        char[] charArray = input.toLowerCase().toCharArray();

        boolean isPalindrome = true;

        // Initialize two pointers
        int start = 0;
        int end = charArray.length - 1;

        // Two-pointer comparison logic
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}