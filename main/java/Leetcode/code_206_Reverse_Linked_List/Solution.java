package Leetcode.code_206_Reverse_Linked_List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode root = new ListNode(0);
        ListNode nextNode;

        while(head != null){
            nextNode = head.next;
            head.next = root.next;
            root.next = head;
            head = nextNode;


        }




        return root.next;
    }
}
