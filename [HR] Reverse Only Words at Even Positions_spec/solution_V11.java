            // 1. Split sentence into words
            String[] words = s.split(" ");
            
            // 2. Loop through words using 1-based index
            for (int i = 1; i <= words.length; i++) {
                // Check for even positions (2, 4, 6...)
                if (i % 2 == 0) {
                    // Access the array using 0-based index (i - 1)
                    char[] ch = words[i - 1].toCharArray();
                    
                    // In-place character swap to reverse the word
                    for (int j = 0; j < ch.length / 2; j++) {
                        char temp = ch[j];
                        ch[j] = ch[ch.length - 1 - j];
                        ch[ch.length - 1 - j] = temp;
                    }
                    
                    // Update the array element
                    words[i - 1] = String.valueOf(ch);
                }
            
            String s = scanner.nextLine();
        if (scanner.hasNextLine()) {
        
        Scanner scanner = new Scanner(System.in);
        // Use Scanner to read input from the console
public class Solution {
    public static void main(String[] args) {
import java.util.Scanner;
