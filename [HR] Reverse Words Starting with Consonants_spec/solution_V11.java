            }
            int end = i - 1;

                i++;
            int start = i;
            while (i < n && s.charAt(i) != ' ') {
            // 1. Handle spaces exactly as they are
            if (s.charAt(i) == ' ') {
                result += " ";
                i++;
                continue;
            }

            // 2. Find boundaries of the current word
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named 
        Solution. */
         Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";
        int n = s.length();
        int i = 0;

        while (i < n) {