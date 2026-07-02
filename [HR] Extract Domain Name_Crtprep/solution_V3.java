
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] arr = s.toCharArray();
        String res = "";
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {

            if (arr[i] == '@') {
                flag = true;
                continue;
            }

            if (flag == true) {
                if (arr[i] == '.')
                    break;

                res += arr[i];
            }
        }

        System.out.println(res);
import java.util.*;
import java.io.*;