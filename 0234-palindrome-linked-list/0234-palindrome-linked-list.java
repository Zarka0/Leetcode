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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            l1.add(curr.val);
            curr=curr.next;
        }
        for(int i=l1.size()-1; i>=0; i--){
            l2.add(l1.get(i));
        }
        return l1.equals(l2);

            }
}