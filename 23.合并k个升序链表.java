/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个升序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        if(lists.length == 2) return mergeTwoLists(lists[0], lists[1]);

        int mid = lists.length/2;
        ListNode[] l1 = new ListNode[mid];
        for(int i=0;i<mid;i++){
            l1[i] = lists[i];
        }
        ListNode[] l2 = new ListNode[lists.length-mid];
        for(int i=mid,j=0;i<lists.length;i++,j++){
            l2[j] = lists[i]; 
        }

        return mergeTwoLists(mergeKLists(l1), mergeKLists(l2));
    }

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

