class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1,secmax=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>secmax)
            {
                secmax=arr[i];
                
            }
        }
        return secmax;
        
    }
}