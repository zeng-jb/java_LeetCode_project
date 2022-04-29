package jainzhi;

public class J52 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode h1 = headA;
        ListNode h2 = headB;
        
        while(h1 != h2) {
        	h1 = (h1 == null) ? headB : h1.next;
        	h2 = (h2 == null) ? headA : h2.next;
        }
        return h1;
    }
}
