import java.io.*;
import java.util.*;
​
public class Solution {
​
    // Fix 1: Make the method static
    static void printCharacterPattern(int num) {
        // Fix 2: Loop from i = 0 up to num
        for (int i = 0; i < num; i++) {
            // Fix 3: Loop j <= i to print the correct number of characters
            for (int j = 0; j <= i; j++) {
                // Fix 4: Cast the addition back to a char
                System.out.print((char)('a' + j));
            }
            // Fix 5: Print a new line after each row is complete
            System.out.println();
        }
    }
​
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
​
        // Fix 6: Call the method correctly without 'void' and using 'n'
        printCharacterPattern(n);
​
        sc.close();
    }
}