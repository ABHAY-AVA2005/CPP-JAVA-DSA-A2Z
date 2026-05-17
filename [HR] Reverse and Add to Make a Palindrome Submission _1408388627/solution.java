import java.io.*;
import java.util.*;
​
public class Solution {
​
    // Helper method to check if a number is a palindrome
    public static boolean isPalindrome(long num) {
        long original = num;
        long reversed = 0;
        while (num > 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }
        return original == reversed;
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) {
            return;
        }
        
        // Using long to handle large numbers safely
        long n = sc.nextLong();
        
        if (isPalindrome(n)) {
            System.out.println("Given Number is already a palindrome");
        } else {
            // This outer loop manages the multi-step addition process
            while (true) {
                long originalN = n; 
                long rev = 0;
                long temp = n;
                
                // This separate inner loop safely isolates the digit reversal
                while (temp > 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                
                // Perform the required addition step
                long sum = originalN + rev;
                
                // Print the current step exactly as required by the challenge
                System.out.println(originalN + " + " + rev + " = " + sum);
                
                // Check if the calculation has resolved into a palindrome
                if (isPalindrome(sum)) {
                    break;
                }
                
                // Pass the new sum to n to initiate the next step cycle
                n = sum;
            }
        }
    }
}