import java.io.*;
import java.util.*;
​
public class Solution {
    
    public static int countDigits(int num) 
    { 
        int count=0; 
        int temp=num;
        while(num!=0){
            num=num/10; 
            count++; 
        } 
    return temp%count; 
}
​
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int remainder=countDigits(n);
        System.out.println(remainder);
    }
}