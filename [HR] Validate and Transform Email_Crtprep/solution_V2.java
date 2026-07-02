import java.util.*;

public class Solution{

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int idx=s.indexOf('@');

        if(idx==-1||idx!=s.lastIndexOf('@')){
            System.out.println("Invalid Email");
            return;
        }

        int dot=s.indexOf('.',idx);

        if(dot==-1){
            System.out.println("Invalid Email");
            return;
        }

        String username=s.substring(0,idx);

        if(username.length()<3){
        }

        String domain=s.substring(idx+1,dot);
