public class PalindromeCheckerApp {
    static class PalindromeChecker {
        public boolean checkPalindrome(String input) {
            if (input == null) {
                return false;
            }
            String normalized = input.toLowerCase().replaceAll("\\s+", "");
            return isPalindrome(normalized, 0, normalized.length() - 1);
        }

        public static boolean isPalindrome(String str, int start, int end) {
            if (start >= end) {
                return true;
            }
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            return isPalindrome(str, start + 1, end - 1);
        }

        public static void main(String[] args) {
            String input = "racecar";
            PalindromeChecker checker = new PalindromeChecker();
            boolean result = checker.checkPalindrome(input);
            System.out.println("Input: " + input);
            System.out.println("Is it a palindrome? " + result);
        }
    }
}