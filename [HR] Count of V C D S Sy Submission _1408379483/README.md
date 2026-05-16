# Count of V C D S Sy Submission #1408379483

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  StPeters Session 2 crt2026  Count of V C D S Sy
Count of V C D S Sy
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
        Scanner sc = new Scanner(System.in);
8
9
            return;
10
        }
11
        String s = sc.nextLine();
12
        
13
        int lowerVowels = 0;
14
        int upperVowels = 0;
15
        int lowerConsonants = 0;
16
        int upperConsonants = 0;
17
        int digits = 0;
18
        int specialChars = 0;
19
        int spaces = 0;
20
        
21
        for (int i = 0; i < s.length(); i++) {
22
            char ch = s.charAt(i);
23
            
24
            if (ch >= 'a' && ch <= 'z') {
25
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
26
                    lowerVowels++;
27
                } else {
28
                    lowerConsonants++;
29
                }
30
            } else if (ch >= 'A' && ch <= 'Z') {
31
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
32
                    upperVowels++;
33
                } else {
34
                    upperConsonants++;
35
                }
36
            } else if (ch >= '0' && ch <= '9') {
37
                digits++;
38
            } else if (ch == ' ') {
39
                spaces++;
40
            } else {
41
                specialChars++;
42
            }
43
        }
44
        
45
        System.out.println(lowerVowels);
46
        System.out.println(upperVowels);
47
        System.out.println(lowerConsonants);
48
        System.out.println(upperConsonants);
49
        System.out.println(digits);
50
        System.out.println(specialChars);
51
        System.out.println(spaces);
52
    }
53
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