import java.util.List;

/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    public ListNode sortList(ListNode head) {
        return head == null ? null : mergeSort(head);
    }

    // 归并排序
    public ListNode mergeSort(ListNode head){
        // 已经只有一个不能再分了，直接返回
        if(head.next == null) return head;

        // 通过快慢指针找到中间位置，将链表分成两半
        ListNode fast = head , slow = head, pre = null;
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // 中间节点断链指向null；
        pre.next = null;
        // 递归左右
        ListNode l = mergeSort(head);
        ListNode r = mergeSort(slow);

        // 返回归并结果
        return merge(l,r);
    }

    // 合并操作
    public ListNode merge(ListNode l, ListNode r){
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;

        while(l != null && r != null){
            if(l.val <= r.val){
                cur.next = l;
                cur = cur.next;
                l = l.next;
            }else{
                cur.next = r;
                cur = cur.next;
                r = r.next;
            }
        }

        if(l != null){
            cur.next = l;
        }
        if(r != null){
            cur.next = r;
        }

        return dummyHead.next;
    }
}
// @lc code=end

