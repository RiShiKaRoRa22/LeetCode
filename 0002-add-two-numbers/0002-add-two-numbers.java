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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;

        ListNode result= new ListNode(0);
        ListNode newhead=result;
        while(l1!=null || l2!=null){
            //carry=0;
            int l1val=0;
            int l2val=0;
            if(l1!=null){
                l1val=l1.val;

            }
            if(l2!=null){
                l2val=l2.val;

            }
            int sum=l1val + l2val;
            sum=sum+carry;
            if(sum>=10){
                carry=1;
                sum=sum%10;
            }
            else{
                carry=0;
            }
            result.next=new ListNode(sum);
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            
            //l2=l2.next;
            result=result.next;
            
        }
        if(carry!=0){
            result.next=new ListNode(1);
        }

       
        return newhead.next;
    }
}