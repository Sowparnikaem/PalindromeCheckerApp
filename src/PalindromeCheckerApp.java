import java.util.ArrayDeque;
import java.util.Deque;



public class PalindromeCheckerApp {


    public static void main(String[] args) {

        String input = "racecar";


        Deque<Character> deque = new ArrayDeque<>();


        for (char c : input.toLowerCase().toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;


        while (deque.size() > 1) {
            Character first = deque.removeFirst();
            Character last = deque.removeLast();

            if (!first.equals(last)) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}