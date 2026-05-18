# Digit Position Weighted Sum 1 Submission #1408416185

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  crt-27-technical-online-sessions-2-7  Digit Position Weighted Sum 1
Digit Position Weighted Sum 1
Problem
Submissions
Leaderboard
Discussions

Submitted 3 minutes ago • Score: 20.00

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
            String numStr = scanner.next();
10
            long totalSum = 0;
11
​
12
            for (int i = 0; i < numStr.length(); i++) {
13
                int digit = numStr.charAt(i) - '0';
14
                int position = i + 1;
15
                totalSum += (long) digit * position;
16
            }
17
​
18
            System.out.println(totalSum);
19
        }
20
​
21
        scanner.close();
22
    }
23
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