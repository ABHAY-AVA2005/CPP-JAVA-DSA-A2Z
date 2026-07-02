import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;

        for (int i=0; i<s.length();i++) {
            char ch=s.charAt(i);

            if (ch=='@')
                break;

            if (ch>='0' && ch<='9')
                count++;
        }

        System.out.println(count);
    }
}