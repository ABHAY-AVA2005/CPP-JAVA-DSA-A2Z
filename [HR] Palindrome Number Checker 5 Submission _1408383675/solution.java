import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) {
            return;
        }
        
        long n = sc.nextLong();
        long originalNumber = n;
        long reversedNumber = 0;
        
        // Reconstruct the number backwards
        while (n > 0) {
            long remainder = n % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            n /= 10;
        }
        
        // Check if the reversed number matches the original input
        if (originalNumber == reversedNumber) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}