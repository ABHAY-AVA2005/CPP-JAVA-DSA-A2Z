import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the entire line of input
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            
            // Split the sentence into an array of words using space as the delimiter
            String[] words = s.split(" ");
            
            // Loop through the array to print each word's details
            for (int i = 0; i < words.length; i++) {
                String currentWord = words[i];
                
                // Print in the exact format: w[index]: word : length
                System.out.println("w[" + i + "]: " + currentWord + " : " + currentWord.length());
            }
        }
        sc.close();
    }
}
