import java.util.LinkedList;
import java.util.ListIterator;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c); // add to the rear
        }
        boolean isPalindrome = true;
        int n = list.size();
        while (list.size() > 1) {
            char front = list.removeFirst();
            char rear = list.removeLast();
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input:" +input);
        System.out.println("Is it a palindrome? " + isPalindrome);
    }
}