/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head, prev = null;
        //找中间节点
        while(fast != null){
            // 确保快节点不为空
            fast = fast.next==null ? fast.next : fast.next.next;
            slow = slow.next;
        }
        // 将中间以后的反转
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        // 开始比对两个链表
        while(head != null && prev != null){
            if(head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;

    }
}
// @lc code=end

