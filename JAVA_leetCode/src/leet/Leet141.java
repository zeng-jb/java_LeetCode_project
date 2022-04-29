package leet;

public class Leet141 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	//环形链表
	public boolean hasCycle(ListNode head) {
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null) {
        	fast = fast.next.next;
        	slow = slow.next;
        	
        	if(fast == slow) {
        		return true;
        	}
        }
        return false;
    }
}
