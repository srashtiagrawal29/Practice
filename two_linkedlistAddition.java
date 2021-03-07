Problem Statement : You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.


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
        ListNode head= new ListNode();
        ListNode node= head;
        int sum=0;
        int carry=0;
        
        while(true){
            sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
                
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum / 10;
            node.val=(sum % 10);
            
            
            if(l1==null && l2 == null && carry==0)
                break;
            node.next=new ListNode();
            node=node.next;
        }
        return head;
           }
}