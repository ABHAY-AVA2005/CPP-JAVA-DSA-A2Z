    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        boolean vowelFound = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c) && (c == 'A' || c == 'E' || 
            c == 'I' || c == 'O' || c == 'U')) {
                res.append(Character.toLowerCase(c));
                vowelFound = true;
            } else if (Character.isLowerCase(c) && (c == 'a' || c == 
            'e' || c == 'i' || c == 'o' || c == 'u')) {
                res.append(Character.toUpperCase(c));
                vowelFound = true;
            } else {
                res.append(c);
            }
        }

        if (!vowelFound) {
            System.out.println("** No vowels present**");
        } else {
            System.out.println(res.toString());
        }
        
import java.util.Scanner;

public class Solution {