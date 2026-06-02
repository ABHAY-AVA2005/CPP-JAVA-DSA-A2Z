import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Generates Pascal's Triangle up to the specified number of rows.
     * * --- COMPLEXITY ANALYSIS ---
     * TIME COMPLEXITY: O(numRows^2)
     * - The outer loop runs 'numRows' times.
     * - The inner loop runs 'i + 1' times for each row (1, 2, 3, ..., numRows).
     * - Total operations = 1 + 2 + 3 + ... + numRows = [numRows * (numRows + 1)] / 2.
     * - Each element operation (.add() and .get()) takes O(1) constant time.
     * * SPACE COMPLEXITY: O(numRows^2)
     * - Auxiliary Space: O(1) as we don't use extra structures outside the result.
     * - Total Space: O(numRows^2) required to store and return the generated 2D list.
     */
    public List<List<Integer>> generate(int numRows) {
        // Optimization: Pre-size outer list to avoid dynamic array resizing overhead
        List<List<Integer>> arr = new ArrayList<>(numRows); 
        
        for (int i = 0; i < numRows; i++) {
            // Optimization: Pre-size row to exactly (i + 1) to eliminate heap reallocations
            List<Integer> row = new ArrayList<>(i + 1); 
            
            for (int j = 0; j <= i; j++) {
                // Outer boundaries (edges of the triangle) are always 1
                if (j == 0 || j == i) { 
                    row.add(1);
                } else {
                    // Core DP relation: Fetch left and right values from the row above (i - 1)
                    int left = arr.get(i - 1).get(j - 1);
                    int right = arr.get(i - 1).get(j);
                    
                    // Sum parents and insert into current index
                    row.add(left + right);
                }
            }
            // Append the fully constructed row to the master list
            arr.add(row);
        }
        
        return arr;
    }

    /*
     * --- COMPLETE DRY RUN (Trace for numRows = 3) ---
     * * Initial State:
     * numRows = 3
     * arr = [] (capacity 3)
     * * =========================================================================
     * OUTER LOOP i = 0 (Generating Row 0):
     * =========================================================================
     * - Creates 'row' list (capacity 1).
     * * - INNER LOOP j = 0:
     * - Condition (j == 0) matches.
     * - row.add(1) -> row is now [1].
     * * - INNER LOOP j = 1: Breaks (j <= i is 1 <= 0, which is False).
     * - arr.add(row) -> arr is now [[1]].
     * * =========================================================================
     * OUTER LOOP i = 1 (Generating Row 1):
     * =========================================================================
     * - Creates 'row' list (capacity 2).
     * * - INNER LOOP j = 0:
     * - Condition (j == 0) matches.
     * - row.add(1) -> row is now [1].
     * * - INNER LOOP j = 1:
     * - Condition (j == i -> 1 == 1) matches.
     * - row.add(1) -> row is now [1, 1].
     * * - INNER LOOP j = 2: Breaks (2 <= 1 is False).
     * - arr.add(row) -> arr is now [[1], [1, 1]].
     * * =========================================================================
     * OUTER LOOP i = 2 (Generating Row 2):
     * =========================================================================
     * - Creates 'row' list (capacity 3).
     * * - INNER LOOP j = 0:
     * - Condition (j == 0) matches.
     * - row.add(1) -> row is now [1].
     * * - INNER LOOP j = 1:
     * - Both (j == 0) and (j == i) are False. Enters 'else' block.
     * - left  = arr.get(2 - 1).get(1 - 1) -> arr.get(1).get(0) -> 1
     * - right = arr.get(2 - 1).get(1)     -> arr.get(1).get(1) -> 1
     * - row.add(left + right) -> row.add(1 + 1) -> row is now [1, 2].
     * * - INNER LOOP j = 2:
     * - Condition (j == i -> 2 == 2) matches.
     * - row.add(1) -> row is now [1, 2, 1].
     * * - INNER LOOP j = 3: Breaks (3 <= 2 is False).
     * - arr.add(row) -> arr is now [[1], [1, 1], [1, 2, 1]].
     * * =========================================================================
     * TERMINATION:
     * =========================================================================
     * - OUTER LOOP i = 3: Breaks (3 < 3 is False).
     * - Returns arr: [[1], [1, 1], [1, 2, 1]].
     */
}