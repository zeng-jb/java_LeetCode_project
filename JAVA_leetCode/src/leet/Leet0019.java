package leet;

public class Leet0019 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	
	public ListNode removeNthFromEnd1(ListNode head, int n) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode delete = findNthFromEnd(head,n+1);
		delete.next = delete.next.next;
		return dummy.next;
    }


	//找到链表的倒数第k个节点
	private ListNode findNthFromEnd(ListNode head, int k) {
		// TODO 自动生成的方法存根
		ListNode p1 = head, p2 = head;
		for(int i=0;i<k;i++) {
			p1 = p1.next;
		}
		while(p1 != null ) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	
	int cur = 0;
	public ListNode removeNthFromEnd2(ListNode head, int n) {
		if(head == null) return null;
		head.next = removeNthFromEnd(head.next, n);
		cur++;
		if(cur == n) return head.next;
		return head;
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode fast = head;
		ListNode slow = dummy;
		
		for(int i=0;i<n;i++) {
			fast = fast.next;
		}
		while(fast != null) {
			fast= fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return dummy.next;
	}
}
