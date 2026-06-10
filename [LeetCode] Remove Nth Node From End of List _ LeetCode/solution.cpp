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
    ListNode* removeNthFromEnd(ListNode* head, int n) {

        int size = 0;
        ListNode* curr = head;

        // Find length of linked list
        while (curr != nullptr) {
            size++;
            curr = curr->next;
        }

        // Delete head node
        if (n == size) {
            return head->next;
        }

        curr = head;

        // Move to node just before target node
        for (int i = 0; i < size - n - 1; i++) {
            curr = curr->next;
        }

        // Delete target node
        curr->next = curr->next->next;

        return head;
    }
};

/*
Approach:
1. Find length of linked list.
2. If nth node from end is the head (n == size),
   return head->next.
3. Otherwise move to the node just before
   the node to be deleted.
4. Adjust pointers.

Time Complexity: O(N)
Space Complexity: O(1)
*/