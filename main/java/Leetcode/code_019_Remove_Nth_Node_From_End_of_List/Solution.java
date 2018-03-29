package Leetcode.code_019_Remove_Nth_Node_From_End_of_List;

import java.util.List;

public class Solution {


        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode slow = head;
            ListNode fast = head;

            for(int i=0;i<n;i++){
                fast = fast.next;
            }

            if(fast.next==null){
                head = head.next;
                return head;
            }

            while(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return head;

    }
}
