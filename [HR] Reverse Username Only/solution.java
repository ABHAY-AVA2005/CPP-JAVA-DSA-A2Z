import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named 
        Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        int idx=s.indexOf('@');
        char[] arr=s.toCharArray();
        
        for(int i=0;i<idx/2;i++)
        {
            char temp=arr[i];
            arr[i]=arr[idx-1-i];
            arr[idx-1-i]=temp;
        }
        
        System.out.println(new String(arr));
        
    }
}