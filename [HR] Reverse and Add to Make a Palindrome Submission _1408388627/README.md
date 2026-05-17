# Reverse and Add to Make a Palindrome Submission #1408388627

### Difficulty: Medium

## Description

Given Number is already a palindrome");
28
        } else {
29
            // This outer loop manages the multi-step addition process
30
            while (true) {
31
                long originalN = n; 
32
                long rev = 0;
33
                long temp = n;
34
                
35
                // This separate inner loop safely isolates the digit reversal
36
                while (temp > 0) {
37
                    rev = rev * 10 + temp % 10;
38
                    temp /= 10;
39
                }
40
                
41
                // Perform the required addition step
42
                long sum = originalN + rev;
43
                
44
                // Print the current step exactly as required by the challenge
45
                System.out.println(originalN + " + " + rev + " = " + sum);
46
                
47
                // Check if the calculation has resolved into a palindrome
48
                if (isPalindrome(sum)) {
49
                    break;
50
                }
51
                
52
                // Pass the new sum to n to initiate the next step cycle
53
                n = sum;
54
            }
55
        }
56
    }
57
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