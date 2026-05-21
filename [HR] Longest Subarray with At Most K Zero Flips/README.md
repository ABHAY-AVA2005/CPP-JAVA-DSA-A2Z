# Longest Subarray with At Most K Zero Flips

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  crt-27-technical-online-sessions-1-5  Longest Subarray with At Most K Zero Flips
Longest Subarray with At Most K Zero Flips
Problem
Submissions
Leaderboard
Discussions

Submitted a few seconds ago • Score: 20.00

Status: Accepted
 Test Case #0
 Test Case #1
 Test Case #2
 Test Case #3


Submitted Code

Language: Java 8

 Open in editor
1
import java.io.*;
2
import java.util.*;
3
​
4
public class Solution {
5
    public static void main(String[] args) {
6
        Scanner scanner = new Scanner(System.in);
7
​
8
9
        int n = scanner.nextInt();
10
​
11
        int[] nums = new int[n];
12
        for (int i = 0; i < n; i++) {
13
            nums[i] = scanner.nextInt();
14
        }
15
​
16
        int k = scanner.nextInt();
17
        int maxLength = 0;
18
​
19
        // Outer loop sets the starting index of the subarray
20
        for (int i = 0; i < n; i++) {
21
            int zeroCount = 0;
22
​
23
            // Inner loop expands the subarray starting from index i
24
            for (int j = i; j < n; j++) {
25
                if (nums[j] == 0) {
26
                    zeroCount++;
27
                }
28
​
29
                // If zeros exceed k, we stop expanding this specific subarray
30
                if (zeroCount > k) {
31
                    break;
32
                }
33
​
34
                // Update maxLength if this valid subarray is the longest seen so far
35
                maxLength = Math.max(maxLength, j - i + 1);
36
            }
37
        }
38
​
39
        System.out.println(maxLength);
40
        scanner.close();
41
    }
42
}

Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy |

Pushing...

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
import java.io.*;

import java.util.*;

​

public class Solution {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

​

if (!scanner.hasNextInt()) return;

int n = scanner.nextInt();

​

int[] nums = new int[n];

for (int i = 0; i < n; i++) {

nums[i] = scanner.nextInt();

}

​

int k = scanner.nextInt();

int maxLength = 0;

​

// Outer loop sets the starting index of the subarray

for (int i = 0; i < n; i++) {

int zeroCount = 0;

​

// Inner loop expands the subarray starting from index i

for (int j = i; j < n; j++) {

if (nums[j] == 0) {

zeroCount++;

}

​

// If zeros exceed k, we stop expanding this specific subarray

if (zeroCount > k) {

break;

}

​

// Update maxLength if this valid subarray is the longest seen so far

maxLength = Math.max(maxLength, j - i + 1);

}

}

​

System.out.println(maxLength);

scanner.close();

}

}
```