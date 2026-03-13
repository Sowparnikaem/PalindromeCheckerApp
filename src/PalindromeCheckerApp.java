

public class PalindromeCheckerApp {


    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        String input = "Level";


        boolean isPalindrome = service.checkPalindrome(input);


        System.out.println("Testing String: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}


class PalindromeService {


    public boolean checkPalindrome(String input) {
        if (input == null) return false;


        String str = input.toLowerCase();


        int start = 0;
        int end = str.length() - 1;


        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}