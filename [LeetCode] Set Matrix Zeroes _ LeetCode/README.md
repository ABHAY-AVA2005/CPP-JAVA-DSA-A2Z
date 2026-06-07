# Set Matrix Zeroes - LeetCode

### Difficulty: Medium

## Description

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 
Example 1:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]


Example 2:

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]


 
Constraints:


	m == matrix.length
	n == matrix[0].length
	1 <= m, n <= 200
	-231 <= matrix[i][j] <= 231 - 1


 
Follow up:


	A straightforward solution using O(mn) space is probably a bad idea.
	A simple improvement uses O(m + n) space, but still not the best solution.
	Could you devise a constant space solution?

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

1class Solution {
2public:
3    void setZeroes(vector<vector<int>>& matrix) {
4
5        int n = matrix.size();
6        int m = matrix[0].size();
7
8        // Mark rows and columns that need to be zeroed.
9        vector<int> rows(n, 0);
10        vector<int> cols(m, 0);
11
12        // Step 1: Find all zeroes and mark their rows/columns.
13        for(int i = 0; i < n; i++) {
14            for(int j = 0; j < m; j++) {
15
16                if(matrix[i][j] == 0) {
17                    rows[i] = 1;
18                    cols[j] = 1;
19                }
20            }
21        }
22
23        // Step 2: Set cells to zero if their row or column is marked.
24        for(int i = 0; i < n; i++) {
25            for(int j = 0; j < m; j++) {
26
27                if(rows[i] == 1 || cols[j] == 1)
28                    matrix[i][j] = 0;
29            }
30        }
31    }
32};
33
34/*
35APPROACH (Better Approach):
36
371. Create two extra arrays:
38   - rows[n]
39   - cols[m]
40
412. Traverse the matrix.
42   - Whenever matrix[i][j] == 0:
43     -> Mark rows[i] = 1
44     -> Mark cols[j] = 1
45
463. Traverse the matrix again.
47   - If rows[i] == 1 OR cols[j] == 1,
48     set matrix[i][j] = 0.
49
504. All cells belonging to marked rows or columns
51   become zero.
52
53EXAMPLE:
54
55Input:
561 1 1
571 0 1
581 1 1
59
60After Marking:
61
62rows = [0,1,0]
63cols = [0,1,0]
64
65Result:
66
671 0 1
680 0 0
691 0 1
70
71TIME COMPLEXITY:
72O(n * m) + O(n * m)
73= O(n * m)
74
75SPACE COMPLEXITY:
76O(n + m)
77
78PATTERN:
79Row/Column Marking
80*/
```