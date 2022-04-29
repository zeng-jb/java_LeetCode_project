package jainzhi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class J22 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public static ListNode getKthFromEnd(ListNode head, int k) {
		ListNode firstNode = head;
		
		while(firstNode != null) {
			firstNode = firstNode.next;
			if(k==0) head = head.next;
			else k--;
		}
		
		return head;
    }
	
	public static ListNode reverseList(ListNode head) {
		if(head == null ||head.next == null) return head;
		
		ListNode node = reverseList(head.next);
		
		head.next.next = head;
		head.next = null;
		
		return node;
    }
	
	public static ListNode reverseList1(ListNode head) {
		ListNode pre = null , cur = head;
		while(cur!=null) {
			ListNode next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
			
		}
		return pre;
    }

}
