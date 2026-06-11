class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {

        ListNode *fast = head;
        ListNode *slow = head;

        // move fast n steps ahead
        for(int i=0;i<n;i++)
        {
            fast = fast->next;
        }

        // n == size, delete head
        if(fast == NULL)
            return head->next;


        // stop slow before target node
        while(fast->next != NULL)
        {
            fast = fast->next;
            slow = slow->next;
        }


        ListNode *del = slow->next;
        slow->next = slow->next->next;
        delete del;

        return head;
    }
};