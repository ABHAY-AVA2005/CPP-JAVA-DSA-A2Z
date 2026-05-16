# electricity bill units Submission #1408379734

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  StPeters Session 2 crt2026  electricity bill units
electricity bill units
Problem
Submissions
Leaderboard
Discussions

Submitted a few seconds ago • Score: 10.00

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
​
6
    public static void main(String[] args) {
7
        Scanner sc = new Scanner(System.in);
8
9
            return;
10
        }
11
        int n = sc.nextInt();
12
        int bill = 0;
13
        
14
        if (n <= 100) {
15
            bill = n * 6;
16
        } else if (n <= 200) {
17
            bill = (100 * 6) + (n - 100) * 8;
18
        } else if (n <= 300) {
19
            bill = (100 * 6) + (100 * 8) + (n - 200) * 10;
20
        } else if (n <= 400) {
21
            bill = (100 * 6) + (100 * 8) + (100 * 10) + (n - 300) * 12;
22
        } else {
23
            bill = (100 * 6) + (100 * 8) + (100 * 10) + (100 * 12) + (n - 400) * 14;
24
        }
25
        
26
        System.out.println(bill);
27
    }
28
}

Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy |

Pushing...

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
Test cases not found.
```