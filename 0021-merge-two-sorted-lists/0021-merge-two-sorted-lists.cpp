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
    ListNode* mergeTwoLists(ListNode* a, ListNode* b) {
      ListNode* dummy=new ListNode();
      ListNode* tail=dummy;  
      while(a!=nullptr && b!=nullptr){
        if(a->val<=b->val){
            tail->next=a;
            a=a->next;
        }else{
            tail->next=b;
            b=b->next;
        }
        tail=tail->next;
      }
      if(a==nullptr){
        tail->next=b;
      }else{
        tail->next=a;
      }
      return dummy->next;
    }
};