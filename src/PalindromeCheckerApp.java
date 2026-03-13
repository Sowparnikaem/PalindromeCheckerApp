

public class PalindromeCheckerApp {


    public static void main(String[] args) {

        String testInput = "a".repeat(1000000) + "b" + "a".repeat(1000000);


        PalindromeCheckerApp stackStrategy = new PalindromeCheckerApp();


        long startTime = System.nanoTime();


        boolean result = stackStrategy.isValid(testInput);


        long endTime = System.nanoTime();


        long duration = endTime - startTime;


        System.out.println("--- Benchmarking Results ---");
        System.out.println("Input Length: " + testInput.length());
        System.out.println("Is Palindrome: " + result);
        System.out.println("Execution Time: " + duration + " ns");
        System.out.println("Execution Time: " + (duration / 1_000_000.0) + " ms");
    }
}