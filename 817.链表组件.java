import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=817 lang=java
 *
 * [817] 链表组件
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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().distinct().collect(Collectors.toSet());

        int ans = 0;
        while(head.next != null){
            if(set.contains(head.val) && !set.contains(head.next.val)){
                ans++;
            }
            head = head.next;
        }

        return set.contains(head.val) ? ans+1 : ans;
    }
}
// @lc code=end

