# Merge Two Sorted Lists - LeetCode

### Difficulty: Hard

## Description

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 
Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]


Example 2:

Input: list1 = [], list2 = []
Output: []


Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


 
Constraints:


	The number of nodes in both lists is in the range [0, 50].
	-100 <= Node.val <= 100
	Both list1 and list2 are sorted in non-decreasing order.

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Input: list1 = [], list2 = []
Output: []

Input: list1 = [], list2 = [0]
Output: [0]

list1 = []
list2 =[]
Output
[0]
Expected
[]

1/**
2 * Definition for singly-linked list.
3 * struct ListNode {
4 *     int val;
5 *     ListNode *next;
6 *     ListNode() : val(0), next(nullptr) {}
7 *     ListNode(int x) : val(x), next(nullptr) {}
8 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
9 * };
10 */
11#include <vector>
12#include <algorithm>
13
14class Solution {
15public:
16    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
17        std::vector<int> elements;
18
19        // Step 1: Extract all elements from the first linked list
20        ListNode* temp1 = list1;
21        while (temp1 != nullptr) {
22            elements.push_back(temp1->val);
23            temp1 = temp1->next;
24        }
25
26        // Step 2: Extract all elements from the second linked list
27        ListNode* temp2 = list2;
28        while (temp2 != nullptr) {
29            elements.push_back(temp2->val);
30            temp2 = temp2->next;
31        }
32
33        // Handle edge case: Both input lists were empty
34        if (elements.empty()) return nullptr;
35
36        // Step 3: Sort the combined elements array
37        std::sort(elements.begin(), elements.end());
38
39        // Step 4: Rebuild a brand-new linked list from the sorted array
40        ListNode* newHead = new ListNode(elements[0]);
41        ListNode* current = newHead;
42        
43        for (size_t i = 1; i < elements.size(); i++) {
44            current->next = new ListNode(elements[i]);
45            current = current->next;
46        }
47
48        return newHead;
49    }
50};
51
```