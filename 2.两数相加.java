import java.util.List;

import org.w3c.dom.stylesheets.LinkStyle;

/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      /*  ListNode root = new ListNode(0);
       ListNode temp = root;
       int carry = 0;
       while(l1 != null || l2 != null || carry > 0){
           int l1val = (l1 == null) ? 0 : l1.val;
           int l2val = (l2 == null) ? 0 : l2.val;
           int sum = l1val + l2val + carry;
           carry = sum / 10;
           ListNode sumNode = new ListNode(sum%10);
           temp.next = sumNode;
           temp = sumNode;

           if(l1 != null) l1 = l1.next;
           if(l2 != null) l2 = l2.next;
       }
       return root.next;
       */
       ListNode root = new ListNode(0);
       ListNode temp = root;
       int carry = 0;
       while(l1 != null || l2 != null || carry > 0){
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sum = num1+num2+carry;
            ListNode sumNode = new ListNode(sum%10);
            carry = sum / 10;
            temp.next = sumNode;
            temp = temp.next;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
       }

       return root.next;
    }
}
// @lc code=end

