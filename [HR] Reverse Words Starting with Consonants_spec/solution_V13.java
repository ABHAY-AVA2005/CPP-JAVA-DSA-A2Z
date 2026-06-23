import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output 
        to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";
        int n = s.length();
        int i = 0;

        while (i < n) {
            // 1. Handle spaces exactly as they are
            if (s.charAt(i) == ' ') {
                result += " ";
                i++;
                continue;
            }

            // 2. Find boundaries of the current word
            int start = i;
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }
            int end = i - 1;
