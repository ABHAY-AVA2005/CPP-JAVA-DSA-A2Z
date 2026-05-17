import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named
        Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
         if(arr[i]>max)
         {
             max=arr[i];
             System.out.print(max+" ");
         }
        }
        
    }
}