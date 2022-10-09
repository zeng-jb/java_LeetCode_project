/*
 * @lc app=leetcode.cn id=1721 lang=java
 *
 * [1721] 交换链表中的节点
 */

// @lc code=start
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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode fast = head;
        for(int i=1;i<k;i++) fast = fast.next;

        ListNode cur = fast;
        ListNode slow = head;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        int temp = slow.val;
        slow.val = cur.val;
        cur.val = temp;

        return head;
    }
}
// @lc code=end

