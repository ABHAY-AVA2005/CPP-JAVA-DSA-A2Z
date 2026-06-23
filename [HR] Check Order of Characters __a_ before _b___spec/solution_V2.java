import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output 
        to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='b' && flag==0) flag++;
            else if(flag==1 && s.charAt(i)=='a'){
                flag++;
                break;
            }
            
        }
        
        if(flag==1 || flag==0) System.out.println("true");
        else System.out.println("false");
    }
}