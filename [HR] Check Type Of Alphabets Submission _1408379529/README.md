# Check Type Of Alphabets Submission #1408379529

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  StPeters Session 2 crt2026  Check Type Of Alphabets
Check Type Of Alphabets
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
        char ch = sc.next().charAt(0);
12
        
13
        if (ch >= 'a' && ch <= 'z') {
14
            System.out.println("Lowercase Alphabet");
15
        } else if (ch >= 'A' && ch <= 'Z') {
16
            System.out.println("Uppercase Alphabet");
17
        } else if (ch >= '0' && ch <= '9') {
18
            System.out.println("Number");
19
        } else {
20
            System.out.println("Special Character");
21
        }
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