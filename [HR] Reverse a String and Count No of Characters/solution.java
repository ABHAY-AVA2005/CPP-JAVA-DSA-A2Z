import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        
        // Your reversing logic is excellent and completely correct
        for(int i = 0; i < ch.length / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = temp;
        }
        
        // FIX 1: Print the reversed character array properly
        System.out.println(ch); 
        
        // FIX 2: Print the length of the string on a new line
        System.out.println(s.length());
    }    
}
