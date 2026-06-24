import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.next();
            StringBuilder result = new StringBuilder();
            HashSet<Character> seen = new HashSet<>();

            for (int i=0;i<s.length();i++) {
                if (seen.contains(s.charAt(i))) {
                    break;
                } else {
                    seen.add(s.charAt(i));
                    result.append(s.charAt(i));
                }
            }
            System.out.println(result.toString());

    }
}