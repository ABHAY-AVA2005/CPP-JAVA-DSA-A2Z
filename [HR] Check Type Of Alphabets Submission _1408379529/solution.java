import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) {
            return;
        }
        char ch = sc.next().charAt(0);
        
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Alphabet");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Number");
        } else {
            System.out.println("Special Character");
        }
    }
}