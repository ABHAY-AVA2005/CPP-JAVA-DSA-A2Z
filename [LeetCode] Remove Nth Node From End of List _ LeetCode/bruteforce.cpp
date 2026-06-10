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

        // Count total nodes
        while(curr != nullptr)
        {
            size++;
            curr = curr->next;
        }

        // Remove head node
        if(n == size)
        {
            return head->next;
        }

        curr = head;

        // Reach node just before target node
        for(int i = 0; i < size - n - 1; i++)
        {
            curr = curr->next;
        }

        // Delete target node
        curr->next = curr->next->next;

        return head;
    }
};

/*
APPROACH:
1. Count total number of nodes.
2. Find position of node to delete from beginning:
      position = size - n
3. Move to node just before target:
      position - 1
4. Skip target node:
      curr->next = curr->next->next
5. Special Case:
      If n == size, delete head.

TIME COMPLEXITY:
O(N)

SPACE COMPLEXITY:
O(1)
*/
