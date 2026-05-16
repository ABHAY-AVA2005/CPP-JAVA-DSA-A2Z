import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            return;
        }
        int amount = sc.nextInt();
        
        if (amount > 20000) {
            System.out.println("Please enter a lesser denomination");
        } else if (amount % 100 != 0) {
            System.out.println("Please enter the amount in multiples of 100");
        } else if (amount <= 500) {
            int hundreds = amount / 100;
            System.out.println(hundreds + " hundreds");
        } else {
            int fiveHundreds = amount / 500;
            int remaining = amount % 500;
            int hundreds = remaining / 100;
            System.out.println(fiveHundreds + ":500s " + hundreds + ":100s");
        }
    }
}