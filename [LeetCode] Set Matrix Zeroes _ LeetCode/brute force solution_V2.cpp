class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {

        int n = matrix.size();
        int m = matrix[0].size();

        // Mark rows and columns that need to be zeroed.
        vector<int> rows(n, 0);
        vector<int> cols(m, 0);

        // Step 1: Find all zeroes and mark their rows/columns.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        // Step 2: Set cells to zero if their row or column is marked.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(rows[i] == 1 || cols[j] == 1)
                    matrix[i][j] = 0;
            }
        }
    }
};

/*
APPROACH (Better Approach):

1. Create two extra arrays:
   - rows[n]
   - cols[m]

2. Traverse the matrix.
   - Whenever matrix[i][j] == 0:
     -> Mark rows[i] = 1
     -> Mark cols[j] = 1

3. Traverse the matrix again.
   - If rows[i] == 1 OR cols[j] == 1,
     set matrix[i][j] = 0.

4. All cells belonging to marked rows or columns
   become zero.

EXAMPLE:

Input:
1 1 1
1 0 1
1 1 1

After Marking:

rows = [0,1,0]
cols = [0,1,0]

Result:

1 0 1
0 0 0
1 0 1

TIME COMPLEXITY:
O(n * m) + O(n * m)
= O(n * m)

SPACE COMPLEXITY:
O(n + m)

PATTERN:
Row/Column Marking
*/
