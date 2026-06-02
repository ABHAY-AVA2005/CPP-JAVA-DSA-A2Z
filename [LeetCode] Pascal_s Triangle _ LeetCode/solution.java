import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * TIME COMPLEXITY: O(numRows^2) -> Outer loop runs 'numRows' times, inner loop runs 'i + 1' times. Total operations follow the arithmetic sum: [numRows * (numRows + 1)] / 2.
     * SPACE COMPLEXITY: O(numRows^2) -> Memory required to store and return the complete generated 2D list structure. Auxiliary Space is O(1).
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>(numRows); 
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1); 
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) { 
                    row.add(1);
                } else {
                    int left = arr.get(i - 1).get(j - 1);
                    int right = arr.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            arr.add(row);
        }
        
        return arr;
    }

    /*
     * --- COMPLETE DRY RUN (Trace for numRows = 3) ---
     * * Initial State: numRows = 3, arr = []
     * =========================================================================
     * OUTER LOOP i = 0 (Row 0):
     * =========================================================================
     * - row list created (capacity 1).
     * - j = 0: (j == 0) matches -> row.add(1) -> row is [1].
     * - j = 1: Breaks (1 <= 0 is False).
     * - arr.add(row) -> arr is [[1]].
     * =========================================================================
     * OUTER LOOP i = 1 (Row 1):
     * =========================================================================
     * - row list created (capacity 2).
     * - j = 0: (j == 0) matches -> row.add(1) -> row is [1].
     * - j = 1: (j == i) matches -> row.add(1) -> row is [1, 1].
     * - j = 2: Breaks (2 <= 1 is False).
     * - arr.add(row) -> arr is [[1], [1, 1]].
     * =========================================================================
     * OUTER LOOP i = 2 (Row 2):
     * =========================================================================
     * - row list created (capacity 3).
     * - j = 0: (j == 0) matches -> row.add(1) -> row is [1].
     * - j = 1: Enters 'else' -> left = arr.get(1).get(0) [1], right = arr.get(1).get(1) [1] -> row.add(1 + 1) -> row is [1, 2].
     * - j = 2: (j == i) matches -> row.add(1) -> row is [1, 2, 1].
     * - j = 3: Breaks (3 <= 2 is False).
     * - arr.add(row) -> arr is [[1], [1, 1], [1, 2, 1]].
     * =========================================================================
     * TERMINATION: i = 3 Breaks (3 < 3 is False). Returns arr.
     */
}