class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;

        // Step 1: Find the first element from the right that breaks descending order
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        
        // Step 2: If pivot exists, find the target to swap with
        if (pivot != -1) {
            int swapTarget = n - 1;
            // Scan from right to left to find the first element larger than arr[pivot]
            while (arr[swapTarget] <= arr[pivot]) {
                swapTarget--;
            }
            // Swap them
            int temp = arr[pivot];
            arr[pivot] = arr[swapTarget];
            arr[swapTarget] = temp;
        }

        // Step 3: Reverse everything to the right of the pivot
        int start = pivot + 1;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}