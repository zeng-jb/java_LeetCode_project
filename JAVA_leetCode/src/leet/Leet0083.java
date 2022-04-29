package leet;

public class Leet0083 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	
	public ListNode deleteDuplicates1(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		if(head == null) return null;
		while(fast != null) {
			if(slow.val != fast.val) {
				slow.next = fast;
				slow = slow.next;
			}
			fast = fast.next;
		}
		
		slow.next = null;
		return head;
    }
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) return null;
		head.next = deleteDuplicates(head.next);
		if(head.val == head.next.val) head = head.next;
		return head;
	}
}
