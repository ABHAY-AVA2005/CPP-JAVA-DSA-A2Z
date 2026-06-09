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
    ListNode* middleNode(ListNode* head) {
        // Handle boundary case: empty list
        if (head == nullptr) return nullptr;

        // Initialize both pointers at the starting node (index 0)
        ListNode* slow = head;
        ListNode* fast = head;

        // Loop execution guards against running into or dereferencing a null pointer.
        // - fast != nullptr: safeguards against even-length lists terminating points.
        // - fast->next != nullptr: safeguards against odd-length lists terminating points.
        while (fast != nullptr && fast->next != nullptr) {
            slow = slow->next;          // Slow runner moves 1 node per iteration (Speed = 1)
            fast = fast->next->next;    // Fast runner moves 2 nodes per iteration (Speed = 2)
        }

        // When fast reaches the end boundaries, slow is structurally guaranteed 
        // to reside at the middle node position.
        return slow;
    }
};
