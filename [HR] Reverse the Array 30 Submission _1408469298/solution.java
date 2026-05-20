import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void arrayReverse(int[] arr) {
        int len = arr.length;
        int temp;
​
        // Clean loop condition, no dynamically shrinking variables
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
    }
​
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
​
        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
​
        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
​
        // Reverse the array in place
        arrayReverse(arr);
​
        // Print the reversed array elements separated by a space
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
​
        sc.close();
    }
}