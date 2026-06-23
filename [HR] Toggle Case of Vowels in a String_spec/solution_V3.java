        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check uppercase vowels
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                res += (char) (c + 32); // Convert to lowercase
            } 
            // Check lowercase vowels
            else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                res += (char) (c - 32); // Convert to uppercase
            } 
            // Keep everything else unchanged
            else {
                res += c;
            }
        String s = sc.nextLine();
        }

            System.out.println("** No vowels present**");
            sc.close();
            return;
        if (!sc.hasNextLine()) {
        Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) {
public class Solution {

import java.util.Scanner;