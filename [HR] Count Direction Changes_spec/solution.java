import java.io.*;
import java.util.*;
public class Solution{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int count=0;
for(int i=1;i<s.length();i++){
if(s.charAt(i)!=s.charAt(i-1)){
count++;
}
}
System.out.println(count);
}

    

}