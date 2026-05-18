import java.io.*;
import java.util.*;
​
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
​
        if (scanner.hasNext()) {
            String numStr = scanner.next();
            long totalSum = 0;
​
            for (int i = 0; i < numStr.length(); i++) {
                int digit = numStr.charAt(i) - '0';
                int position = i + 1;
                totalSum += (long) digit * position;
            }
​
            System.out.println(totalSum);
        }
​
        scanner.close();
    }
}