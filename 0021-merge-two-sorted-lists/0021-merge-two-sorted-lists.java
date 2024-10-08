/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
     ListNode dummy=new ListNode();
     ListNode tail=dummy;
     while(a!=null && b!=null){
        if(a.val<=b.val){
            tail.next=a;
            a=a.next;
        }else{
            tail.next=b;
            b=b.next;
        }
        tail=tail.next;
     } 
     if(a==null){
        tail.next=b;
       
     }else{
        tail.next=a;
    
     }
     return dummy.next;  
    }
}