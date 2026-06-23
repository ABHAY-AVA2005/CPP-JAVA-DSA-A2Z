import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named 
        Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='b' && flag==0) flag++;
        }
        int flag=0;
            else if(flag==1 && s.charAt(i)=='a'){
                flag++;
            }
    }
                break;
        if(flag==1) System.out.println("true");
        
            
        else System.out.println("false");
}