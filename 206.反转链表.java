import java.util.Stack;

/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode root = new ListNode(0);
        ListNode node = root;
        while(!stack.isEmpty()){
            ListNode temp = stack.pop();
            node.next = temp;
            node = node.next;
        }
        // 保证这里指向空，不然成环
        node.next = null;
        return root.next;
    }
}
// @lc code=end

