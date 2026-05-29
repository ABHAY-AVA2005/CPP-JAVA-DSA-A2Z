import java.io.*;
import java.util.*;
​
public class Solution {
    
    static long factorial(int num)
    {
        long fact=1;
        for(int i=2;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
    }
        
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum+=factorial(i);
            }
            else
            {
                sum-=factorial(i);
            }
        }
        
        System.out.print(sum);
        
    }
}