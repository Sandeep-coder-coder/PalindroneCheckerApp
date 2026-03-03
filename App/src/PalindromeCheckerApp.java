public class PalindromeCheckerApp {
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
        String input = "A man a plan a canal Panama";
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        boolean result = isPalindrome(normalized, 0, normalized.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is it a palindrome? " + result);
    }
}