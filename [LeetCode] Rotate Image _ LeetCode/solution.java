class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Algorithm Step 1: Transpose the matrix by swapping elements across the main diagonal
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Algorithm Step 2: Reverse each individual row horizontally to complete the 90-degree clockwise rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        
        // Complexity Analysis:
        // Time Complexity: O(n^2) - Every element in the n x n matrix is visited a constant number of times.
        // Space Complexity: O(1) - The matrix is transformed entirely in-place without using extra memory.
    }
}