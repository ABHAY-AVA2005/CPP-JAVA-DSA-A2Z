        {
        }   
            if(s.charAt(i)>s.charAt(i+1))
            {
                res+=">";
            }
            else if(s.charAt(i)<s.charAt(i+1))
            {
                res+="<";
            }
            else{
                res+="=";
            }
        
        System.out.println(res);
        
    }
}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be 
        named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        String res="";
        int n=s.length();
        
        for(int i=0;i<n-1;i++)
public class Solution {

    public static void main(String[] args) {