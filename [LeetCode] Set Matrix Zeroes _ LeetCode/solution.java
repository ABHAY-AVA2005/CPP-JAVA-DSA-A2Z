class Solution {
    public void setZeroes(int[][] matrix) {

        // Number of rows
        int m = matrix.length;

        // Number of columns
        int n = matrix[0].length;

        // row[i] = true means row i should be made zero
        boolean[] row = new boolean[m];

        // col[j] = true means column j should be made zero
        boolean[] col = new boolean[n];

        // First pass:
        // Find all cells containing 0
        // Mark their corresponding row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {

                    // Mark this row
                    row[i] = true;

                    // Mark this column
                    col[j] = true;
                }
            }
        }

        // Second pass:
        // If a cell belongs to a marked row
        // OR a marked column, make it 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}