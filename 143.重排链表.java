/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        // 快慢指针，找中间分割两个链表
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // 后链表，前链表最后置空
        ListNode needReverser = slow.next;
        slow.next = null;
        // 反转
        needReverser =  reverse(needReverser);


        ListNode cur = head;
        while(cur != null && needReverser != null){
            ListNode sec = needReverser;
            needReverser = needReverser.next;

            ListNode curNext = cur.next;
            sec.next = cur.next;
            cur.next = sec;

            cur = curNext;
        }
    }

    // 反转链表
    public ListNode reverse(ListNode head){
        ListNode p1 = null;
        ListNode p2 = head;
        ListNode p3 = p2;

        while(p2 != null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;

        }

        return p1;
    }
}
// @lc code=end

