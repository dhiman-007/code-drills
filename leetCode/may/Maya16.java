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

//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3331/
class Solution {
    public ListNode oddEvenList(ListNode head) {
      
       ListNode oddList = new ListNode(0);
        ListNode odd = oddList;
       ListNode evenList = new ListNode(0);
        ListNode even = evenList;
        ListNode temp = head;
       int val=0,z=0;
        
        if(head == null || head.next == null)
            return head;
        
        while(temp!=null){
            if(z==0){
                val =temp.val;
                odd.next = new ListNode(val);
                odd=odd.next;
                z=1;
                    
            }else if(z==1){
                val= temp.val;
                //System.out.println(val);
                even.next= new ListNode(val);
                even=even.next;
                z=0;
            }
            temp=temp.next;
        }
        //combining odd and even index link list
        odd.next = evenList.next;
        return oddList.next;
    }
}