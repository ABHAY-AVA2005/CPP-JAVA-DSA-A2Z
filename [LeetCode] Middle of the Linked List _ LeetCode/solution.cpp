class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        if (!head) return nullptr;

        // Pass 1: Count total nodes accurately
        ListNode* temp = head;
        int total_nodes = 0;
        while (temp != nullptr) {
            total_nodes++;
            temp = temp->next;
        }
        
        // Pass 2: Move exactly to the middle index
        int target = total_nodes / 2; 
        temp = head;
        for (int i = 0; i < target; i++) {
            temp = temp->next;
        }

        return temp;
    }
};
