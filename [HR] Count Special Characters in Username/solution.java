import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named 
        Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        String str=sc.next();
        int idx=str.indexOf('@');
        char[] s=str.toCharArray();
        int count=0;
        
        for(int i=0;i<idx;i++)
        {
            if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z') || (s[i]>='0' && s[i]<='9'))
            {
                continue;
            }
            else count++;
        }
        
        System.out.println(count);
        
    }
}
