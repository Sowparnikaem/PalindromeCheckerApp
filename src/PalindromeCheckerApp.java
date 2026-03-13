
import java.util.Stack;


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String testInput = "wasitacaroracatisaw";


        PalindromeStrategy strategy = new StackStrategy();


        boolean result = strategy.isValid(testInput);


        System.out.println("Input: " + testInput);
        System.out.println("Strategy Used: Stack-based");
        System.out.println("Is Palindrome: " + result);
    }
}


interface PalindromeStrategy {
    boolean isValid(String input);
}


class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isValid(String input) {
        if (input == null) return false;

        String cleanInput = input.toLowerCase();
        Stack<Character> stack = new Stack<>();


        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
        }


        for (char c : cleanInput.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}