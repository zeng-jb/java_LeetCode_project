package leet;

public class Leet876 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	//�ҳ�������м���
	public ListNode middleNode(ListNode head) {
		ListNode fast = head , slow = head;
		while(fast != null && fast.next != null) {
			//˫ָ�룬һ��һ����������ߵ���βʱ����ָ���ߵ�������м���
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
    }
}
