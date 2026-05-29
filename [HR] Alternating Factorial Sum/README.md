# Alternating Factorial Sum

### Difficulty: Medium

## Description

Given an integer N, compute the result using the following pattern:

Result = 1! - 2! + 3! - 4! + 5! - 6! ... ± N!

The sign alternates:

Odd factorial → add Even factorial → subtract

Input Format

N

Constraints

1 ≤ N ≤ 15 (factorials grow fast)

Output Format

Single integer result

Sample Input 0

4


Sample Output 0

-19


Explanation 0

1! - 2! + 3! - 4! = 1 - 2 + 6 - 24 = -19

Sample Input 1

5


Sample Output 1

101


Explanation 1

1 - 2 + 6 - 24 + 120 = 101

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
4

-19

5

101

import java.io.*;

import java.util.*;

​

public class Solution {

static long factorial(int num)

{

long fact=1;

for(int i=2;i<=num;i++)

{

fact*=i;

}

return fact;

}

public static void main(String[] args) {

/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

long sum=0;

for(int i=1;i<=n;i++)

{

if(i%2!=0)

{

sum+=factorial(i);

}

else

{

sum-=factorial(i);

}

}

System.out.print(sum);

}

}

Input (stdin):
4

Your Output (stdout):
-19

Expected Output:
-19

Input (stdin):
5

Your Output (stdout):
101

Expected Output:
101
```