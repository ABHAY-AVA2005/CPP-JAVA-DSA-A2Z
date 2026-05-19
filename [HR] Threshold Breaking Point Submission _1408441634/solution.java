import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int threshold=sc.nextInt();
        int[] arr=new int[n];
        int prefixsum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            prefixsum+=arr[i];
            if(prefixsum>threshold){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        
    }
}