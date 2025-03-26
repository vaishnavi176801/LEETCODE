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

 //Integer Overflow
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

     ListNode curr = l1;
     ListNode AddOn =l2;

     ListNode result=new ListNode(0);
     ListNode l3 =result;
     int val=0;
     

     while(curr!=null || AddOn!=null){
       if(curr!=null){
        val+=curr.val;
       }
       if(AddOn!=null){
        val+=AddOn.val;
       }
       
        result.next = new ListNode(val%10);
        val=val/10;

       result=result.next;

       if(curr!=null)
       curr=curr.next;

       if(AddOn!=null)
       AddOn=AddOn.next;

     }

     if(val==1) {
        result.next =new ListNode(val);
        
    }
    return l3.next;
    }

}