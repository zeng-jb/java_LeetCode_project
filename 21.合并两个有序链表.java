/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    /* 
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode(0);
        ListNode head = root;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ListNode temp = new ListNode(list1.val);
                head.next = temp;
                head = temp;
                list1 = list1.next;
            }else{
                ListNode temp = new ListNode(list2.val);
                head.next = temp;
                head = temp;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            head.next = list1;
        }
        if(list2 != null){
            head.next = list2;
        }
        return root.next;
    }
    */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = null;
        if(list1.val < list2.val){
            head = list1;
            head.next = mergeTwoLists(list1.next, list2);
        }else{
            head = list2;
            head.next = mergeTwoLists(list1, list2.next);
        }
        return head;
    }
}
// @lc code=end

