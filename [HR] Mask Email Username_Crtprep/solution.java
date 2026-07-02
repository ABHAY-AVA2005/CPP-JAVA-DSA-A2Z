import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] arr = s.toCharArray();

        int idx = s.indexOf('@');

        for (int i = 1; i < idx - 1; i++) {
            arr[i] = '*';
        }

        System.out.println(new String(arr));
    }
}