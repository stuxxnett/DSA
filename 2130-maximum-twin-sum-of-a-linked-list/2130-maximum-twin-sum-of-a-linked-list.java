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
    public int pairSum(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = reverse(slow);
        int sum=0;
        ListNode temp = head;
        while(temp != slow){
            sum = Math.max(sum,temp.val+head2.val);
            temp = temp.next;
            head2 = head2.next;
        }
        return sum;

    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}