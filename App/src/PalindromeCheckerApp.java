import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";
        char[] chars = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : chars) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input:" +input);
        System.out.println("Is it a palindrome? " + isPalindrome);
    }
}