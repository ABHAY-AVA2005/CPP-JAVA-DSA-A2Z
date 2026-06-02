class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Optimization: Pre-size the outer list container to avoid dynamic background resizing overhead
        List<List<Integer>> arr = new ArrayList<>(numRows); 
        
        // Loop through each tier of the triangle from index 0 to numRows - 1
        for (int i = 0; i < numRows; i++) {
            // Optimization: Allocate exact capacity (i + 1) for the current row to prevent heap reallocations
            List<Integer> row = new ArrayList<>(i + 1); 
            
            // Populate individual positions inside row i
            for (int j = 0; j <= i; j++) {
                // Outer boundaries (first and last elements) are always set to 1
                if (j == 0 || j == i) { 
                    row.add(1);
                } else {
                    // Fetch left and right contributing values from the cached row directly above (i - 1)
                    int left = arr.get(i - 1).get(j - 1);
                    int right = arr.get(i - 1).get(j);
                    
                    // Add the historical parents together and push into the current slot
                    row.add(left + right);
                }
            }
            // Commit the complete row data structures to the master tracker array
            arr.add(row);
        }
        
        // Return the final optimal 2D collection list
        return arr;
    }
}