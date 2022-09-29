/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
 */
 public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
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
    // public ListNode reverseBetween(ListNode head, int left, int right) {
    //     ListNode dummy = new ListNode(0);
    //     dummy.next = head;
    //     ListNode pre = dummy;
    //     for(int i=1;i<left;i++) pre = pre.next;

    //     head = pre.next;

    //     for(int i=left;i<right;i++){
    //         ListNode nex = head.next;
    //         head.next = nex.next;
    //         nex.next = pre.next;
    //         pre.next = nex;
    //     }


    //     return dummy.next;
    // }

    /*
     * 递归反转整个链表
     */
    public ListNode reverse(ListNode head){
        if(head.next == null) return head;
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    /*
     * 递归反转前N个链表
     * 保存第n之后的后驱节点sec
     */
    ListNode secNode = null;
    public ListNode reverseN(ListNode head, int n){

        if(n == 1){
            secNode = head.next;
            return head;
        }

        ListNode last = reverseN(head.next,n-1);

        head.next.next = head;
        head.next = secNode;
        return last;
    }

    // 递归反转l到r的节点链表
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == 1){
            return reverseN(head, right);
        }
        head.next = reverseBetween(head.next, left-1, right-1);

        return head;
    }
}
// @lc code=end

