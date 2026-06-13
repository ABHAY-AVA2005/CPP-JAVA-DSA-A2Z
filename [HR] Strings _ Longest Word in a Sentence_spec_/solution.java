import java.util.*;

public class MaxLenWord{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();

        String[] w=s.split(" ");
        String max="";
        for(int i=0;i<w.length;i++)
        {
            if(w[i].length()>max.length())
            {
                max=w[i];
            }
        }
        System.out.println(max);
    }
}