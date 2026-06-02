import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * --- 2-LINE COMPLEXITY ANALYSIS ---
     * TIME COMPLEXITY: O(numRows^2) -> The outer loop runs 'numRows' times, and the inner 'col' loop runs 'row' times to calculate each element in O(1) mathematical updates.
     * SPACE COMPLEXITY: O(numRows^2) -> Memory required strictly to store and return the final 2D structural list matrix; Auxiliary Space is O(1).
     */
    
    // Changed to public: Helper function to generate a single row in O(N) time
    public List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); // The first element is always 1
        
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        
        return ansRow;
    }

    // Main function to generate the entire Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }
        
        return ans;
    }

    /*
     * --- BRIEF DRY RUN (Trace for generateRow(6) -> Row 6) ---
     * * Initial State: row = 6, ans = 1 -> ansRow initialized to [1]
     * =========================================================================
     * LOOP ITERATIONS (col tracks from 1 up to 5):
     * =========================================================================
     * - col = 1: ans = 1 * (6 - 1) / 1 => 5 / 1 => ans = 5 -> ansRow is [1, 5]
     * - col = 2: ans = 5 * (6 - 2) / 2 => 20 / 2 => ans = 10 -> ansRow is [1, 5, 10]
     * - col = 3: ans = 10 * (6 - 3) / 3 => 30 / 3 => ans = 10 -> ansRow is [1, 5, 10, 10]
     * - col = 4: ans = 10 * (6 - 4) / 4 => 20 / 4 => ans = 5 -> ansRow is [1, 5, 10, 10, 5]
     * - col = 5: ans = 5 * (6 - 5) / 5 => 5 / 5 => ans = 1 -> ansRow is [1, 5, 10, 10, 5, 1]
     * =========================================================================
     * TERMINATION: col = 6 breaks loop (6 < 6 is False). Returns [1, 5, 10, 10, 5, 1].
     */
}