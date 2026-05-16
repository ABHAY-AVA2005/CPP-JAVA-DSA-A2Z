import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int max=a;
        if(b>a && b>c) max=b;
        else if(c>a & c>b) max=c;
        
        System.out.println(max);
    }
}