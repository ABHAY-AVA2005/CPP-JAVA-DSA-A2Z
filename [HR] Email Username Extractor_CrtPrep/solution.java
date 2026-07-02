import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named 
        Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]=='@')
            {
                break;
            }
            
            res+=arr[i];
        }
        
        System.out.println(res);
        
    }
}
