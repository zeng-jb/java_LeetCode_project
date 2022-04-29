package leet;

public class Leet0160 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(p1 != p2) {
        	if(p1 != null) {        		
        		p1 = p1.next;
        	}else {
        		p1 = headB;
        	}
        	if(p2 != null) {        		
        		p2 = p2.next;
        	}else {
        		p2 = headA;
        	}
        }
        return p1;
    }
}
