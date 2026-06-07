class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {

        int n = matrix.size();
        int m = matrix[0].size();

        // Stores whether first column should be zeroed.
        int col0 = 1;

        // Step 1: Use first row and first column as markers.
        for (int i = 0; i < n; i++) {

            // Check if current row's first column contains 0.
            if (matrix[i][0] == 0)
                col0 = 0;

            // Traverse remaining columns.
            for (int j = 1; j < m; j++) {

                if (matrix[i][j] == 0) {

                    // Mark the row.
                    matrix[i][0] = 0;

                    // Mark the column.
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Fill zeros using markers.
        // Traverse from bottom-right to preserve markers.
        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 1; j--) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }

            // Handle first column separately.
            if (col0 == 0)
                matrix[i][0] = 0;
        }
    }
};

/*
APPROACH:

1. Use the first row and first column as marker arrays.

2. While traversing the matrix:
   - If matrix[i][j] == 0
     -> Mark its row by setting matrix[i][0] = 0
     -> Mark its column by setting matrix[0][j] = 0

3. First column cannot be handled using matrix[0][0]
   because matrix[0][0] is already used for the first row.
   Hence, use an extra variable 'col0' to track whether
   the first column needs to be zeroed.

4. Traverse the matrix from bottom-right:
   - If row marker OR column marker is 0,
     make the current cell 0.
   - Handle the first column separately using col0.

WHY REVERSE TRAVERSAL?

- First row and first column contain markers.
- Forward traversal may overwrite markers before they
  are used.
- Reverse traversal ensures markers remain intact until
  all cells are processed.

TIME COMPLEXITY:
O(n * m)

SPACE COMPLEXITY:
O(1)

PATTERN:
Matrix In-Place Marking / Space Optimization
*/