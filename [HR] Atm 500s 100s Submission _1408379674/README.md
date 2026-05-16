# Atm 500s 100s Submission #1408379674

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  StPeters Session 2 crt2026  Atm 500s 100s
Atm 500s 100s
Problem
Submissions
Leaderboard
Discussions

Submitted a few seconds ago

Status: Processing
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
        int amount = sc.nextInt();
12
        
13
        if (amount > 20000) {
14
            System.out.println("Please enter a lesser denomination");
15
        } else if (amount % 100 != 0) {
16
            System.out.println("Please enter the amount in multiples of 100");
17
        } else if (amount <= 500) {
18
            int hundreds = amount / 100;
19
            System.out.println(hundreds + " hundreds");
20
        } else {
21
            int fiveHundreds = amount / 500;
22
            int remaining = amount % 500;
23
            int hundreds = remaining / 100;
24
            System.out.println(fiveHundreds + ":500s " + hundreds + ":100s");
25
        }
26
    }
27
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