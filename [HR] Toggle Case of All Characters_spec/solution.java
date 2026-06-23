import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                res.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                res.append(Character.toUpperCase(c));
            } else {
                res.append(c);
            }
        }
        System.out.println(res.toString());
    }
}