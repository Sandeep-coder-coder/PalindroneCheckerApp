import java.util.*;
public class PalindromeCheckerApp {
    public static void main (String[] args){
       Scanner scnr=new Scanner(System.in);
       System.out.print("Input text:");
       String str=scnr.nextLine();
       int a=0;
       for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
                a++;
        }
        System.out.print("\nIs it Palindrome? :");
       if(a>=str.length()/2)
           System.out.println(" true");
       else
           System.out.println(" false");

    }
}
