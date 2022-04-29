package leet;

import java.util.PriorityQueue;

public class Leet0023 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	//��С�ѷ���
	public ListNode mergeKLists0(ListNode[] lists) {
		if(lists.length == 0) return null;
		ListNode dummy = new ListNode(-1);
		ListNode p = dummy;
		PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length , (a , b) -> a.val - b.val);
		
		for(ListNode node : lists) {
			if(node != null) {				
				pq.add(node);
			}
		}
		
		while(!pq.isEmpty()) {
			ListNode node = pq.poll();
			p.next = node;
			if(node.next != null) {
				pq.add(node.next);
			}
			p = p.next;
		}
		
		return dummy.next;
    }
	
	//���η����ϲ�k�������ֳ�k/2���ϲ���������
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length == 0) return null;
		return merge(lists,0,lists.length-1);
	}
	
	private ListNode merge(ListNode[] lists, int left, int right) {
		// TODO �Զ����ɵķ������
		if(left == right) return lists[left];
		int mid = (right - left) / 2 + left;
		ListNode l1 = merge(lists, left, mid);
		ListNode l2 = merge(lists, mid+1, right);
		return mergeTwoLists(l1, l2);
	}

	//�ݹ�汾
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
