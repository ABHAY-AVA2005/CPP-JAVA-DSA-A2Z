import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        
        for(int i=1;i<=n;i++)
        {
            if(i%3==0) sum-=(long)(2*i);
            else sum+=i;
        }
        
        System.out.println(sum);
    }
}