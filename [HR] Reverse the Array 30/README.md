# Reverse the Array 30

### Difficulty: Medium

## Description

The function arrayReverse is intended to modify the input array by reversing its elements. The function compiles successfully but does not produce the correct result for some test cases due to logical errors.

void arrayReverse(int len,int *arr) { int i,temp,originalLen=len; for(i=0;i<=originalLen/2;i++) { temp=arr[len-1]; arr[len-1]=arr[i]; arr[i]=temp; len-=1; } }

Input Format

The first line contains an integer n, representing the size of the array. The second line contains n space-separated integers representing the array elements.

Constraints

1≤n≤105 −109≤arr[i]≤109

Output Format

Print the reversed array elements separated by a space.

Sample Input 0

4
4 2 8 6


Sample Output 0

6 8 2 4


Sample Input 1

3
11 20 17


Sample Output 1

17 20 11

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
```