// Leave out the struct definition entirely. LeetCode includes it automatically.

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        // Create a dummy node on the stack to act as the head anchor
        ListNode dummy(0);
        ListNode* temp = &dummy;

        // Traverse both lists concurrently until one runs out
        while (list1 != nullptr && list2 != nullptr) {
            // Pick the node with the smaller value
            if (list1->val <= list2->val) {
                temp->next = list1;   // Link the smaller node
                list1 = list1->next;  // Advance list1 pointer
            } else {
                temp->next = list2;   // Link the smaller node
                list2 = list2->next;  // Advance list2 pointer
            }
            temp = temp->next;        // Move the merging tracking pointer
        }

        // Fast-link remaining nodes from the non-empty list
        if (list1 != nullptr) {
            temp->next = list1;
        } else {
            temp->next = list2;
        }

        // Return the actual head, skipping the dummy node
        return dummy.next;
    }
};
