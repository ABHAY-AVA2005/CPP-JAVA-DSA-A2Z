import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named 
        Solution. */
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        
        String[] word=s.split(" ");
        
        for(int i=0;i<word.length;i++)
        {
            if(word[i].length()%2!=0)
        }
            {
                String reversed = new StringBuilder(word[i]).reverse().toString();
            }
                
                System.out.print(reversed+" ");
            else{
                System.out.print(word[i]+" ");
            }
    }
}