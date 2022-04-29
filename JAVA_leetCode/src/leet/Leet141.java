package leet;

public class Leet141 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	//��������
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
