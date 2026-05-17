# Find the Maximum Element(spec) Submission #1408408804

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  Arrays Level-1 Programs  Find the Maximum Element(spec)
Find the Maximum Element(spec)
Problem
Submissions
Leaderboard
Discussions

Submitted a few seconds ago • Score: 10.00

Status: Accepted
 Test Case #0
 Test Case #1
 Test Case #2


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
​
6
    public static void main(String[] args) {
7
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
8
        Scanner sc = new Scanner(System.in);
9
        
10
        // Read the number of elements
11
        int n = sc.nextInt();
12
        
13
        // Initialize max with the first element or the lowest possible value within constraints
14
        int max = Integer.MIN_VALUE;
15
        
16
        // Loop through all elements to find the maximum
17
        for (int i = 0; i < n; i++) {
18
            int current = sc.nextInt();
19
            if (current > max) {
20
                max = current;
21
            }
22
        }
23
        
24
        // Print the maximum element found
25
        System.out.println(max);
26
        
27
        sc.close();
28
    }
29
}

Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy |

Pushing...

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
```