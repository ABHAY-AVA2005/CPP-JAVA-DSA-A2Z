class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Initialize the master list to store all rows of the triangle
        List<List<Integer>> arr = new ArrayList<>();
        
        // Loop through each row from 0 up to numRows - 1
        for (int i = 0; i < numRows; i++) {
            // Create a new list for the current row at the start of each iteration
            List<Integer> row = new ArrayList<>();
            
            // Loop to populate elements within the current row 'i'
            for (int j = 0; j <= i; j++) {
                // If it's the first element (j==0) or the last element (j==i), it's always 1
                if (j == 0 || j == i) { 
                    row.add(1);
                } else {
                    // For middle elements, safely look up the values from the previous row (i-1)
                    int left = arr.get(i - 1).get(j - 1);
                    int right = arr.get(i - 1).get(j);
                    
                    // Sum them up and add to the current row
                    row.add(left + right);
                }
            }
            // Append the fully constructed row to the master list before moving to the next row
            arr.add(row);
        }
        
        // Return the complete 2D list structure
        return arr;
    }
}