import java.util.*;
public class PalindromeCheckerApp {
    interface PalindromeStrategy {
        boolean check(String input);
    }
    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String input) {
            Stack<Character> stack = new Stack<>();
            for (char c : input.toCharArray()) {
                stack.push(c);
            }
            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }
            return true;
        }
    }
    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String input) {
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : input.toCharArray()) {
                deque.addLast(c);
            }
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }
            return true;
        }
    }
    static class PalindromeChecker {
        private PalindromeStrategy strategy;
        public PalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }
        public boolean checkPalindrome(String input) {
            if (input == null) return false;
            String normalized = input.toLowerCase().replaceAll("\\s+", "");
            return strategy.check(normalized);
        }
    }
    public static void main(String[] args) {
        String input = "level";
        System.out.println("Input: " + input);
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeChecker stackChecker = new PalindromeChecker(stackStrategy);
        long startStack = System.nanoTime();
        boolean stackResult = stackChecker.checkPalindrome(input);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;
        System.out.println("Stack Result: " + stackResult);
        System.out.println("Stack Execution Time: " + stackTime + " ns");
        System.out.println("--------------------------------");

        PalindromeStrategy dequeStrategy = new DequeStrategy();
        PalindromeChecker dequeChecker = new PalindromeChecker(dequeStrategy);

        long startDeque = System.nanoTime();
        boolean dequeResult = dequeChecker.checkPalindrome(input);
        long endDeque = System.nanoTime();

        long dequeTime = endDeque - startDeque;

        System.out.println("Deque Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + dequeTime + " ns");
    }
}