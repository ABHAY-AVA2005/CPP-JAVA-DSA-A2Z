# Problem

### Difficulty: Courses
Tutorials
Practice
Jobs
99+
A
Ask A Doubt
My Doubts

Doubt Assistance Not Available.

Back

All

Articles

Videos

Problems

Next Track

Problems (13)
Sort By

Second Largest

Easy
Accuracy: 26.72%

Move All Zeroes to End

Easy
Accuracy: 45.51%

Reverse an Array

Easy
Accuracy: 55.32%

Rotate Array

Medium
Accuracy: 37.06%

Next Permutation

Medium
Accuracy: 40.66%

Majority Element - More Than n/3

Medium
Accuracy: 48.1%

Stock Buy and Sell – Multiple Transaction Allowed

Medium
Accuracy: 13.43%

Stock Buy and Sell – Max one Transaction Allowed

Easy
Accuracy: 49.33%

Minimize the Heights II

Medium
Accuracy: 15.06%

Kadane's Algorithm

Medium
Accuracy: 36.28%

Maximum Product Subarray

Medium
Accuracy: 18.09%

Max Circular Subarray Sum

Hard
Accuracy: 29.37%

Smallest Positive Missing

Medium
Accuracy: 25.13%

Problems Solved

4 of 13 Complete. (31%)

Progress may take upto 2 hours to reflect.

Problem
Editorial
Submissions
Second Largest
Go to Videos
Next
 EasyAccuracy: 26.72%Submissions: 1.5MPoints: 2Average Time: 15m

Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.

Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105

Try more examples
Expected Complexities
Company Tags
SAP LabsRockstand
Topic Tags
Related Articles
Report An Issue
If you are facing any issue on this page. Please let us know.
Java (21)
Add note
Start Timer
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
Custom InputCompile & RunSubmit

## Description
Description not found.

## Company Tags
SAP Labs, Rockstand

## Topic Tags
SAP Labs, Rockstand

## Test Cases
```
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
```