import java.util.*;

public class Solution{

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        TreeMap<String,Integer> map=new TreeMap<>();
 
        for(int i=0;i<n;i++){

            String s=sc.next();
            int idx=s.indexOf('@');
            String domain=s.substring(idx+1);
            
            //method to increment value if exist  else deafault it to 0
            map.put(domain,map.getOrDefault(domain,0)+1); 
        }

        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}