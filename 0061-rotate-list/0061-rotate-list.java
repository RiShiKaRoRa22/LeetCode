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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }

        int len=1;
        ListNode temp= head;
        
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }

        k=k%len;
        if(k==0)return head;
        temp.next=head;

        int rtamt= len-k;
        ListNode t=head;
        int i=1;
        while(i<rtamt){
            t=t.next;
            i++;   
        }

        ListNode newhead=t.next;   
        t.next=null;

        return newhead;   
    }
     
}