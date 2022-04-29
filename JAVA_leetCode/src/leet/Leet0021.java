package leet;

public class Leet0021 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	
	public ListNode mergeTwoLists0(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
		ListNode p = dummy , p1 = list1 , p2 = list2;
		while(p1 != null && p2 != null) {
			if(p1.val <= p2.val) {
				p.next = p1;
				p1 = p1.next;
			}else {
				p.next = p2;
				p2 = p2.next;
			}
			p = p.next;
		}
		if(p1 != null) {
			p.next =  p1;
		}
		if(p2 != null) {
			p.next = p2;
		}
		
		return dummy.next;
    }
	
	//递归版本
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1 == null) {
			return list2;
		}
		if(list2 == null) {
			return list1;
		}
		if(list1.val <= list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		}else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
		
	}
}
