1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
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