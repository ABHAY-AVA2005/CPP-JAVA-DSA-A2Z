import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // 1. Create a StringBuilder, reverse it, and convert back to String
        String reversed = new StringBuilder(s).reverse().toString();
        
        // 2. Print outputs
        System.out.println(reversed);
        System.out.println(s.length());
    }    
}
