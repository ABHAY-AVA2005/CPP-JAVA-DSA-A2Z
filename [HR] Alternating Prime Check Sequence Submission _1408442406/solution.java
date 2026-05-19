import java.io.*;
import java.util.*;
​
public class Solution {
​
    // Optimized helper function to check if a number is prime
    public static boolean isPrime(int num) {
        // Direct checks for numbers less than 5
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
​
        // Start checking directly from 5 and step by 6
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
​
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Edge case: A sequence of 1 element is always alternating by default
        if (n <= 1) {
            System.out.println("YES");
            return;
        }
​
        boolean alternating = true;
        // Check if adjacent elements alternate between prime and non-prime
        for (int i = 0; i < n - 1; i++) {
            boolean currentPrime = isPrime(arr[i]);
            boolean nextPrime = isPrime(arr[i + 1]);
            
            // If both are prime or both are non-prime, alternation breaks
            if (currentPrime == nextPrime) {
                alternating = false;
                break;
            }
        }
​
        if (alternating) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}