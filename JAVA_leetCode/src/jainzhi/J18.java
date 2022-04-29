package jainzhi;

public class J18 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public static ListNode deleteNode(ListNode head, int val) {
		if(head.val == val) return head.next;
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode cur = head;
		while(cur != null && cur.next != null) {
			if(cur.next.val == val) {
				cur.next = cur.next.next;
				break;
			}
			cur = cur.next;
		}
		
		return pre.next;
    }
	
	public static ListNode deleteNode1(ListNode head, int val) {
		if(head == null) return null;
		if(head.val == val) return head.next;
		head.next = deleteNode1(head.next, val);
		return head;
    }
}
