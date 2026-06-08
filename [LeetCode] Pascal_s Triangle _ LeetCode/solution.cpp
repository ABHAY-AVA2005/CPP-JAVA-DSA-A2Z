#include <vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        // Initialize a 2D vector with 'numRows' rows to store the triangle
        vector<vector<int>> arr(numRows);
        
        // Iterate through each row from 0 to numRows - 1
        for (int i = 0; i < numRows; ++i) {
            // Create a temporary vector to construct the current row
            vector<int> row;
            
            // Each row 'i' has exactly 'i + 1' elements
            for (int j = 0; j <= i; ++j) {
                // The first and last elements of every row are always 1
                if (j == 0 || j == i) {
                    row.emplace_back(1);
                } 
                // Interior elements are the sum of the two elements directly above it
                else {
                    // Fetch the element above and to the left from the previous row
                    int left = arr[i - 1][j - 1];
                    // Fetch the element directly above from the previous row
                    int right = arr[i - 1][j];
                    
                    // Add their sum to the current row
                    row.emplace_back(left + right);
                }
            }
            // Assign the fully constructed row to its respective position in the main triangle array
            arr[i] = row;
        }
        // Return the final generated Pascal's Triangle
        return arr;
    }
};