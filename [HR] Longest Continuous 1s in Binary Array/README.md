# Longest Continuous 1s in Binary Array

### Difficulty: Medium

## Description

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Input Format

First line contains an integer N → size of the array Second line contains N space-separated integers (only 0 or 1)

Constraints

1 <= nums.length <= 10 power 5 nums[i] is either 0 or 1.

Output Format

Print a single integer → maximum number of consecutive 1's

Sample Input 0

6
1 1 0 1 1 1


Sample Output 0

3


Explanation 0

The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Sample Input 1

5
0 0 0 0 0


Sample Output 1

0

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
6
1 1 0 1 1 1

3

5
0 0 0 0 0

0

import java.io.*;

import java.util.*;

​

public class Solution {

​

public static void main(String[] args) {

/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

int[] arr=new int[n];

for(int i=0;i<n;i++)

{

arr[i]=sc.nextInt();

}

int count=0;

int maxlength=0;

//sliding window approach

for(int i=0;i<n;i++)

{

if(arr[i]==1)

{

count++;

maxlength=Math.max(maxlength,count);

}

else count=0;

}

System.out.println(maxlength);

}

}
```