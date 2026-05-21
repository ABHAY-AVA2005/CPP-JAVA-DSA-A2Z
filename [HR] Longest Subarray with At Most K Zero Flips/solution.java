import java.io.*;
import java.util.*;
​
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
​
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
​
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
​
        int k = scanner.nextInt();
        int maxLength = 0;
​
        // Outer loop sets the starting index of the subarray
        for (int i = 0; i < n; i++) {
            int zeroCount = 0;
​
            // Inner loop expands the subarray starting from index i
            for (int j = i; j < n; j++) {
                if (nums[j] == 0) {
                    zeroCount++;
                }
​
                // If zeros exceed k, we stop expanding this specific subarray
                if (zeroCount > k) {
                    break;
                }
​
                // Update maxLength if this valid subarray is the longest seen so far
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
​
        System.out.println(maxLength);
        scanner.close();
    }
}