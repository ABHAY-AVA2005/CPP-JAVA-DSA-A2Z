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
        // Base case: If list is empty or has only one node, it is already reversed.
        // Return head as the new head of the reversed list.
        if (head == nullptr || head->next == nullptr) {
            return head;
        }
        
        // 1. Recursively reverse the rest of the list (nodes 2 to N).
        // Nhead will store the pointer to the absolute last node (the new head).
        ListNode *Nhead = reverseList(head->next);
        
        // 2. Identify your immediate neighbor node on the right side.
        ListNode* front = head->next;
        
        // 3. Make that neighbor point backward to you (this reverses the link).
        front->next = head;
        
        // 4. Break your original forward link to prevent a circular memory cycle.
        head->next = nullptr;

        // 5. Pass the new head all the way back up the call stack.
        return Nhead;
    }
};
