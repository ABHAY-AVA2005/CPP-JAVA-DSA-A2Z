class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int index=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                //swap
                int tmp=arr[index];
                arr[index]=arr[i];
                arr[i]=tmp;
                
                index++;
                
            }
        }
        
        
    }
}