# Zig-Zag Sum Pattern

### Difficulty: Medium

## Description

Given a number N, compute the result using a zig-zag number pattern:

Add numbers from 1 → N But every 3rd number is subtracted twice Pattern Rule If i % 3 == 0 → result = result - 2*i Else → result = result + i

Input Format

N

Constraints

1 ≤ N ≤ 10^5

Output Format

Single integer result

Sample Input 0

6


Sample Output 0

-6


Explanation 0

i=1 → +1 → 1 i=2 → +2 → 3 i=3 → -6 → -3 i=4 → +4 → 1 i=5 → +5 → 6 i=6 → -12 → -6

Final = -6

Sample Input 1

5


Sample Output 1

6


Explanation 1

1 + 2 - 6 + 4 + 5 = 6

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
6

-6

5

6

import java.io.*;

import java.util.*;

​

public class Solution {

​

public static void main(String[] args) {

/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

long sum=0;

for(int i=1;i<=n;i++)

{

if(i%3==0) sum-=(long)(2*i);

else sum+=i;

}

System.out.println(sum);

}

}

Input (stdin):
6

Your Output (stdout):
-6

Expected Output:
-6

Input (stdin):
5

Your Output (stdout):
6

Expected Output:
6
```