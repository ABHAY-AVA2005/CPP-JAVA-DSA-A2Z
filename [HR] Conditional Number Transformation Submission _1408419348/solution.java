import java.io.*;
import java.util.*;
​
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
​
        int n = scanner.nextInt();
​
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
​
                // Transform and print the number
                if (num % 2 == 0) {
                    System.out.print((num * 2) + " ");
                } else {
                    System.out.print((num + 3) + " ");
                }
            }
​
    }
}