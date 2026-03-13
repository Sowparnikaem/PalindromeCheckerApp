import java.util.LinkedList;



public class PalindromeCheckerApp {


    public static void main(String[] args) {

        String input = "level";


        LinkedList<Character> charList = new LinkedList<>();


        for (char c : input.toLowerCase().toCharArray()) {
            charList.add(c);
        }

        boolean isPalindrome = true;


        while (charList.size() > 1) {
            Character first = charList.removeFirst();
            Character last = charList.removeLast();

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