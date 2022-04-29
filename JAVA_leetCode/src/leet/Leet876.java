package leet;

public class Leet876 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	//找出链表的中间结点
	public ListNode middleNode(ListNode head) {
		ListNode fast = head , slow = head;
		while(fast != null && fast.next != null) {
			//双指针，一快一慢，当快的走到链尾时，慢指针走到链表的中间结点
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
    }
}
