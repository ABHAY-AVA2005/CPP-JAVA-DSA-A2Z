#include <stack>

// Using directive allows us to omit the "std::" prefix for standard types
using namespace std;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        // Base case: empty list or a single node needs no changes
        if (head == nullptr || head->next == nullptr) {
            return head;
        }

        // Instantiating the stack without the "std::" prefix
        stack<int> nodeValues;
        ListNode* temp = head;

        // Step 1: Populating the stack with node data
        while (temp != nullptr) {
            nodeValues.push(temp->val);
            temp = temp->next;
        }

        // Reset the walker pointer back to the beginning
        temp = head;

        // Step 2: Extracting data from the stack to overwrite the list values
        while (temp != nullptr) {
            temp->val = nodeValues.top(); 
            nodeValues.pop();             
            temp = temp->next;            
        }

        return head; 
    }
};
