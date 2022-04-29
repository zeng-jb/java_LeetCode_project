package leet;

public class Leet002 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode root = new ListNode(0);
		ListNode temp = root;
		int carry = 0;
		while(l1 != null || l2 != null || carry != 0) {
			int num1 = l1==null ? 0 : l1.val;
			int num2 = l2==null ? 0 : l2.val;
			int sum = num1 + num2 + carry;
			carry = sum / 10;
			ListNode newNode = new ListNode(sum%10);
			temp.next = newNode;
			temp = newNode;
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		
		return root.next;
    }
}

/**
class ListNode{
	int val;
	ListNode next;
	ListNode() {
		// TODO 自动生成的构造函数存根
	}
	ListNode(int x){
		val = x;
	}
	ListNode(int x ,ListNode n){
		val = x;
		next = n;
	}
}

*/