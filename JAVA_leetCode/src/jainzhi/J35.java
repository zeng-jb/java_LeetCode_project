package jainzhi;

import java.util.HashMap;
import java.util.Map;

public class J35 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	public Node copyRandomList1(Node head) {
        if(head == null) return null;
        Map<Node, Node> map = new HashMap<>();
        //mapӳ�䣬�ɽڵ��Ӧ�½ڵ�
        for(Node node = head; node != null ; node = node.next) {
        	map.put(node, new Node(node.val));
        }
        //next �� random 
        for(Node node = head; node != null ; node = node.next) {
        	map.get(node).next = map.get(node.next);
        	map.get(node).random = map.get(node.random);
        }
        
        return map.get(head);
    }
	
	/*
	 * ԭ�ظ��ƽ��1->1`->2->2`
	 */
	public Node copyRandomList(Node head) {
		if(head == null) return null;
		
		for(Node node = head , copy = null ; node != null ; node = node.next.next) {
			copy = new Node(node.val);
			copy.next = node.next;
			node.next = copy;
		}
		//random
		for(Node node = head ; node != null ;node = node.next.next) {
			if(node.random != null) {
				node.next.random = node.random.next;
			}
		}
		
		//������
		Node newNode = head.next;
		for(Node node = head , temp = null ; node != null && node.next != null ;) {
			temp = node.next;
			node.next = temp.next;
			node = temp;
		}
		
		return newNode;
	}
}


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}