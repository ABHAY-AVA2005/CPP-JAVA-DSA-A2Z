class Solution {
    public int maxProfit(int[] arr) {
        // Code here
        
        int n=arr.length;
        int least=arr[0];
        int maxprofit=0;
        
        for(int i=0;i<n;i++)
        {
            int profit =arr[i]-least;
            maxprofit =Math.max(maxprofit,profit);
            least=Math.min(least,arr[i]);
        }
        
        return maxprofit;
    }
}