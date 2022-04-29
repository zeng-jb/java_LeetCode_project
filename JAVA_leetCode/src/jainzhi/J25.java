package jainzhi;

public class J25 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);		
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);		
		l2.next.next = new ListNode(4);
		
		System.out.println(mergeTwoLists(l1, l2));
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode root = new ListNode(-1);
		ListNode pre = root;
		while(l1!=null && l2!=null) {
			if(l1.val <= l2.val) {
				pre.next = l1;
				l1 = l1.next;
			}else {
				pre.next = l2;
				l2 = l2.next;
			}
			pre = pre.next;
		}
		if(l1!=null) {
			pre.next = l1;
		}
		if(l2!=null) {
			pre.next = l2;
		}
		
		return root.next;
    }
	
	public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
		if(l1 == null) {
			return l2;
		}
		if(l2 == null) {
			return l1;
		}
		if(l1.val <= l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
}

class ListNode{
	int val;
	ListNode next;
	public ListNode(int x) {
		// TODO 自动生成的构造函数存根
		val = x;
	}
}