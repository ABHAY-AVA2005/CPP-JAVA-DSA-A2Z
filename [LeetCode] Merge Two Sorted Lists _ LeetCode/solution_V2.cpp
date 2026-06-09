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
#include <vector>
#include <algorithm>

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        std::vector<int> elements;

        // Step 1: Extract all elements from the first linked list
        ListNode* temp1 = list1;
        while (temp1 != nullptr) {
            elements.push_back(temp1->val);
            temp1 = temp1->next;
        }

        // Step 2: Extract all elements from the second linked list
        ListNode* temp2 = list2;
        while (temp2 != nullptr) {
            elements.push_back(temp2->val);
            temp2 = temp2->next;
        }

        // Handle edge case: Both input lists were empty
        if (elements.empty()) return nullptr;

        // Step 3: Sort the combined elements array
        std::sort(elements.begin(), elements.end());

        // Step 4: Rebuild a brand-new linked list from the sorted array
        ListNode* newHead = new ListNode(elements[0]);
        ListNode* current = newHead;
        
        for (size_t i = 1; i < elements.size(); i++) {
            current->next = new ListNode(elements[i]);
            current = current->next;
        }

        return newHead;
    }
};
