import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void arrayReverse(int[] arr) 
    { 
        int temp,len=arr.length; 
        for(int i=0;i<=len/2;i++) 
        { 
            temp=arr[len-1]; 
            arr[len-1]=arr[i]; 
            arr[i]=temp; 
            len-=1; 
        } 
    
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        arrayReverse(arr);
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}