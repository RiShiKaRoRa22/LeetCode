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
    public ListNode sortList(ListNode head) {

        ListNode temp= head;
        if(temp==null || temp.next==null){
            return temp;
        }
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int arr[]= new int[len];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
            
        }

        Arrays.sort(arr);
        ListNode result= new ListNode(0);
        ListNode newhead=result;
        for(int j:arr){
            
            result.next=new ListNode(j);
            result=result.next;
        }
        return newhead.next;


        
    }
}