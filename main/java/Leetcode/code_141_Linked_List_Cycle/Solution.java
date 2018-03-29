package Leetcode.code_141_Linked_List_Cycle;

public class Solution {
    // 设置两个指针(fast, slow)，初始值都指向头，slow每次前进一步，fast每次前进二步，
    // 如果链表存在环，则fast必定先进入环，而slow后进入环，两个指针必定相遇。
    // (当然，fast先行头到尾部为NULL，则为无环链表)程序如下：
    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }

        return !(fast == null || fast.next == null);
    }
}